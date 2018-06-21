#!/usr/bin/env groovy
def call (syntax) {
	if (syntax) {
		sh "echo $syntax"
		res="0" 
	}
	else {
		sh "echo 'NOPE'"
		res="3"
	}
}
	
