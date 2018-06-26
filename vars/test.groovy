#!/usr/bin/env groovy
def call () {
	def script_content = libraryResource 'test.sh'
	//creating file to be able to run script
	writeFile(file: 'test_lib.sh', text: "${script_content}")
	sh "chmod a+x test_lib.sh"
	def err = sh(script: "./test_lib.sh ", returnStatus: true)
	println(err)
}
	
