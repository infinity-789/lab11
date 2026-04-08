pipeline {
    agent any 

    tools {
        maven 'Default'
    }

    stages {

        stage ('Checkout') {
            steps {
                checkout scm
            }
        }

        stage ('Build') {

            steps {
                bat 'mvn clean compile'
            }
        }

        stage ('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage ('Coverage') {
            steps {
                jacoco()
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}