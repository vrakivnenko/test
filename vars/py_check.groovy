#!/usr/bin/env groovy
def call () {
	def score = sh "pylint -d C,R $check_file 2>dev/null | grep rate | awk '{print $7}' | awk -F \"/\" '{print $1}' | awk -F \".\" '{print $1}'"
    if (score > 8) {
        println "your code is exellent"
    } else if (score > 0) {
        println "your code good enough, but can be better"
    } else {
        println "you need to work on your code it`s terrible"
    }
}