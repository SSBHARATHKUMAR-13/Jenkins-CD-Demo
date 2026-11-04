pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                git branch: 'main', url: 'https://github.com/SSBHARATHKUMAR-13/Jenkins-CD-Demo.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                sh 'echo Build completed'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'echo Tests passed'
            }
        }
    }

    post {
        success {
            mail to: 'ssbharathkumar03@gmail.com',
                 subject: "Build #${env.BUILD_NUMBER} SUCCESS - ${env.JOB_NAME}",
                 body: "The pipeline ${env.JOB_NAME} (build #${env.BUILD_NUMBER}) completed successfully. Details: ${env.BUILD_URL}"
        }
        failure {
            mail to: 'ssbharathkumar03@gmail.com',
                 subject: "Build #${env.BUILD_NUMBER} FAILED - ${env.JOB_NAME}",
                 body: "The pipeline ${env.JOB_NAME} (build #${env.BUILD_NUMBER}) failed. Check the console: ${env.BUILD_URL}console"
        }
    }
}
