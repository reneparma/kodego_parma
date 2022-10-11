package activity_01_d

fun main(){
    var amount: Double = 0.0
    var divisor: Double = 0.0

    fun getAmount(){
        var input: Double? = 0.0
        println("Please Enter 5 Numbers")
        try {
            for(i in 1..5){
                input = readLine()!!.toDouble()
                amount += input
            }

        }catch (exception: Exception){
            println("Invalid Input!! Try Again")
            amount = 0.0
            getAmount()
        }
    }

    fun calculateAmount(divisor: Double){
        amount /= divisor
        println(amount)
    }

    getAmount()
    println("Divide the value by how many?")
    divisor = readLine()!!.toDouble()
    calculateAmount(divisor)

}