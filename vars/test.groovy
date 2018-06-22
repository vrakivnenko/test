#!/usr/bin/env groovy
def call (env.GIT_URL) {
	def err
	err = sh "./test.sh &> $(date +'%d/%m/%Y/%H/%M').log"
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
	
