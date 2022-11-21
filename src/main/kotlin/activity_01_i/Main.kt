package activity_01_i

fun main() {
    var products = arrayOf<String>("Apple", "Strawberry","Orange","Grapes","Pineapple")
    var price = arrayOf<Int>(25,25,107,300,90)

    var cart = arrayListOf<String>()
    var ItemPrice = arrayListOf<Int>()
    var quantity = arrayListOf<Int>()

    println("Welcome to ELibrary:")
    for(i in 1..products.size){
        println("$i " + products[i-1])
    }

    println("Please select the fruit you want to buy? 1-5")
    var selection: Int = Integer.valueOf(readLine())

    println("Please Enter the Quantity: ")
    var qty = Integer.valueOf(readLine())

    cart.add(products[selection])
    ItemPrice.add(price[selection])
    quantity.add(qty)

    println("Cart: ${cart.get(0)}")
    println("Price: ${ItemPrice.get(0)}")
    println("Qty: ${quantity.get(0)}")
    println("Total: ${ItemPrice.get(0) * quantity.get(0)}")
}