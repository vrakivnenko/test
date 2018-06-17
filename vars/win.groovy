#!/usr/bin/env groovy
def call (int numb) {
        if (numb % 2 == 0) {
                pipeline {
                        agent any
                        stages {
                                stage('E stage') {
                                        steps {
                                                echo "number is even"
                                        }
                                }
                        }
                }
        } else {
                pipeline {
                        agent any
                        stages {
                                stage ('o stage') {
                                        steps {
                                                echo "number is odd"
                                        }
                                }
                        }
                }
	}
