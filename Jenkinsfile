pipeline {

    agent any

    tools {
        maven 'M3'
    }

    stages {

        stage('Checkout Git') {
            steps {
                git 'https://github.com/shanxify/simple-maven-app.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}