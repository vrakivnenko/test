#!/usr/bin/env groovy
def call (env.GIT_URL) {
	sh "ls -l"
	def err = sh "./test.sh &> $(date +'%d_%m_%Y_%H_%M').log"
	if (err) {
		sh "echo 'Nice job'"
		res="0" 
	}
	else {
		sh "echo 'NOPE'"
		res="3"
	}
	return res
}
	
