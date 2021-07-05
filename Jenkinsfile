pipeline {
    agent any

    stages {
        stage('Preparation') { // for display purposes
            // Get some code from a GitHub repository
            git 'https://github.com/nirvanaflame/dumb.git'
            parameters {
                file description: 'Upload e2e.xlsx', name: 'katas/src/main/resources/data/e2e.txt'
            }
        }

        stage('package') {
            steps {
                if (isUnix()) {
                    echo 'linux'
                    sh 'll'
                    sh 'gradlew assemble'
                } else {
                    echo 'windows'
                    bat 'dir'
                    bat(/"gradlew.bat" assemble/)
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
