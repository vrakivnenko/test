#!/usr/bin/env groovy
def call (check) {

    println check
	def score = sh(script: "pylint -d C,R $check 2> /dev/null | grep rate | awk '{print \$7}' | awk -F \"/\" '{print \$1}' | awk -F \".\" '{print \$1}'" , returnStdout: true)
    if (score.toInteger() > 8) {
        echo "your code is exellent"
        return "0"
    } else if (score.toInteger() > 0) {
        echo "your code good enough, but can be better"
        return "0"
    } else {
        echo "you need to work on your code its terrible"
        return "1"
    }
}