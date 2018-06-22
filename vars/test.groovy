#!/usr/bin/env groovy
def call () {
	def script_content = libraryResource 'test.sh'
	writeFile(file: 'test_lib.sh', text: "${script_content}")
	sh "set -x; chmod a+x test_lib.sh; ls -l; cat test_lib.sh;"
	def err = sh(script: "./test_lib.sh ", returnStatus: true)
	println(err)
}
	
