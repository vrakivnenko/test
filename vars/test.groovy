#!/usr/bin/env groovy
def call (syntax) {
	if (syntax) {
		echo syntax
	}
	else {
		echo 'NOP'
	}
}
	
