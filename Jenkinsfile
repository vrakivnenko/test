pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		withCredentials([sshUserPrivateKey(credentialsId: 'SSH_KEY', keyFileVariable: 'SSH_KEY', passphraseVariable: '', usernameVariable: 'root')]) {
    			echo "I got access"
			println env.SSH_KEY
			sh 'echo $SSH_KEY'
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
