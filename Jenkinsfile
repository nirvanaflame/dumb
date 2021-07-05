pipeline {
    agent any

    stages {
        stage('Preparation') {

            steps {
                step('Copy file parameter') {
                    parameters {
                        file description: 'Upload e2e.xlsx', name: 'katas/src/main/resources/data/e2e.txt'
                    }
                }

                step('Clean project // make it optional') {
                    sh 'gradlew clean'
                }

                step('Download changes git changes') {
                    git 'https://github.com/nirvanaflame/dumb.git'
                }
            }
        }

        stage('Build') {
            steps {
                step {
                    echo 'linux'
                    sh 'll'
                    sh 'gradlew assemble'
                }
            }
        }

        stage('Test') {
            steps {

                step {
                    sh 'gradlew test'
                }

                step {
                    script {
                        def testResults = findFiles(glob: '**/TEST-*.xml')
                        for (xml in testResults) {
                            touch xml.getPath()
                        }
                    }
                }
            }
        }

        stage('Results') {
            steps {

                step {
                    archiveArtifacts 'build/*.jar'
                }

                step {
                    junit allowEmptyResults: true, healthScaleFactor: 20.0, testResults: '**/TEST-*.xml'
                }
            }
        }
    }
}
