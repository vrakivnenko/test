#!/usr/bin/env groovy
def call (syntax) {
	if (syntax == true) {
		def syntax = "pass"
	} else {
		echo "Syntax is bad"
	}
}
	
