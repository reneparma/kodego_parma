package activity_01_g

    fun isPalindromeString(inputStr: String): Boolean {
        val sb = StringBuilder(inputStr)

        val reverseStr = sb.reverse().toString()
        return inputStr.equals(reverseStr, ignoreCase = true)
    }

    fun main(args: Array<String>) {

        println("Enter String : ")
        val inString: String = readLine().toString()

        if (isPalindromeString(inString)) {
            println("$inString Palindrome")
        } else {
            println("$inString Not Palindrome")
        }
    }
