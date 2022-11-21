package activity_01_f

import mu.KotlinLogging
private val logger = KotlinLogging.logger{}


fun main() {
    var string1: String
    var string2: String
    var uniqueChars = mutableSetOf<Char>()

    logger.info { "Please enter a string: " }
    string1 = readLine().toString()
    logger.info { "Please enter a string: " }
    string2 = readLine().toString()

    for (iter in 1..string1.length) {
        if(string1[iter-1].lowercase() !in string2.lowercase()){
            uniqueChars.add(string1[iter-1])
        }
    }
    for (iter in 1..string2.length) {
        if(string2[iter-1].lowercase() !in string1.lowercase()){
            uniqueChars.add(string2[iter-1])
        }
    }

    for (char in uniqueChars){
        logger.info { "Unique character: $char" }
    }
}