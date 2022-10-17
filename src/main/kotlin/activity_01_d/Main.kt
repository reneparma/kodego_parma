package activity_01_d

fun main(){
    var amount: Int = 0
    var divisor: Int = 0

    fun getAmount(){
        var input: Int? = 0
        println("Please Enter 5 Numbers")
        try {
            for(i in 1..5){
                input = readLine()!!.toInt()
                amount += input
            }
        }catch (exception: Exception){
            println("Invalid Input!! Try Again")
            amount = 0
            getAmount()
        }
    }
    fun calculateAmount(divisor: Int){
        amount /= divisor
        println(amount)
    }

    getAmount()
    println("Divide the value by how many?")
    divisor = readLine()!!.toInt()
    calculateAmount(divisor)

}