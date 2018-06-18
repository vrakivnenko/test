#!/usr/bin/env groovy
def call (syntax) {
	script {
		if (syntax == true) {
			def syntax = "pass"
		} else {
			echo "Syntax is bad"
		}
	}
}
	
