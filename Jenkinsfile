pipeline {
    agent any
    parameters {
        file description: 'Upload e2e.xlsx', name: 'katas/src/main/resources/data/e2e.txt'
    }

    stages {
        stage('Checkout') {
            steps {

                git 'https://github.com/nirvanaflame/dumb.git'

            }
        }

        stage('Build') {
            steps {
                sh 'gradlew build'
                script {
                    def testResults = findFiles(glob: '**/TEST-*.xml')
                    for (xml in testResults) {
                        touch xml.getPath()
                    }
                }
            }

            post {
                always {
                    archiveArtifacts 'build/*.jar'
                    junit allowEmptyResults: true, healthScaleFactor: 20.0, testResults: '**/TEST-*.xml'
                }
            }
        }
    }
}
