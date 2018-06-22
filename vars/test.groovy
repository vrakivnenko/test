#!/usr/bin/env groovy
def call (syntax) {
	sh "./test.sh &> $(date +'%d/%m/%Y/%H/%M').log"
	if (errors === 0) {
		sh "echo 'Nice job'"
		res="0" 
	}
	else {
		sh "echo 'NOPE'"
		res="3"
	}
	return res
}
	
