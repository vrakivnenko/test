#!/usr/bin/env groovy
def call () {
	sh "echo 'test.groovy'; ls -l"
	def script_content = libraryResource 'test.sh'
	sh "echo \"${script_content}\" > test_lib.sh && chmod a+x test_lib.sh && ./test_lib.sh"

	// def err = sh "./test.sh &> $(date +'%d_%m_%Y_%H_%M').log"
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
	
