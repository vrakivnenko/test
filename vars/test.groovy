#!/usr/bin/env groovy
def call () {
	sh "echo 'test.groovy'; ls -l"
	def script_content = libraryResource 'test.sh'

	// sh "set -x; echo \"${script_content}\" > test_lib.sh && chmod a+x test_lib.sh && ./test_lib.sh"

	writeFile file: 'test_lib.sh', text: "${script_content}"
	sh "set -x; chmod a+x test_lib.sh; ls -l; cat test_lib.sh;"
	
	def err = sh(script: "./test_lib.sh &> $(date +'%d_%m_%Y_%H_%M').log", returnStatus: true)
	sh "$err"
	// if (err) {
	// 	sh "echo 'Nice job'"
	// 	res="0" 
	// }
	// else {
	// 	sh "echo 'NOPE'"
	// 	res="3"
	// }
	// return res
}
	
