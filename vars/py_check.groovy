#!/usr/bin/env groovy
def call (check_file) {

    echo "check"
    println check_file
	def score = sh "pylint -d C,R $check_file 2>dev/null | grep rate | awk '{print $7}' | awk -F \"/\" '{print $1}' | awk -F \".\" '{print $1}'"
    if (score > 8) {
        echo "your code is exellent"
        return "0"
    } else if (score > 0) {
        echo "your code good enough, but can be better"
        return "0"
    } else {
        echo "you need to work on your code it`s terrible"
        return "1"
    }
}