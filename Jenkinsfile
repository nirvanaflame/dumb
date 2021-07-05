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

        stage('Build') {
            steps {
                if (isUnix()) {
                    echo 'linux'
                    sh 'll'
                    sh 'gradlew build'
                } else {
                    echo 'windows'
                    bat 'dir'
                    bat(/"gradlew.bat" build/)
                }
            }
        }

        stage('Results') a {
            steps {
                step {
                    junit allowEmptyResults: true, healthScaleFactor: 20.0, testResults: '**/TEST-*.xml'
                }
                step {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
