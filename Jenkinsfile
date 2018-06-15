pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		withCredentials([sshUserPrivateKey(credentialsId: 'SSH_KEY', keyFileVariable: 'SSH_KEY', passphraseVariable: '', usernameVariable: 'root')]) {
    			echo "I got access"
		}

            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
