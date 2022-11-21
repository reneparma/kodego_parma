package activity_01_d

private val logger = mu.KotlinLogging.logger {}
fun main(){
    var amount: Int = 0
    var divisor: Int = 0

    fun getAmount(){
        var input: Int? = 0
        logger.info("Please Enter 5 Numbers")
        try {
            for(i in 1..5){
                logger.info("Please Enter a valid number: ")
                input = readLine()!!.toInt()
                amount += input
            }
        }catch (exception: Exception){
            logger.error("Invalid Input!! Try Again")
            amount = 0
            getAmount()
        }
    }
    fun calculateAmount(divisor: Int){
        amount /= divisor
        logger.info("$amount")
    }

    getAmount()
    logger.info("Divide the value by how many?")
    divisor = readLine()!!.toInt()
    calculateAmount(divisor)

}