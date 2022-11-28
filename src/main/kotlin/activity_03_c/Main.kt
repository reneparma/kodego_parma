package activity_03_c

var groceries = arrayListOf<String>("Apple", "Orange", "Piatos", "Nova", "Loaf Bread", "Coke")
var price = arrayListOf<Int>(25, 30, 13, 13, 25, 20)
var cart = HashMap<String, Int>()

fun main() {
    addToCart("Eggs", 12)
    addToCart("Coke", 24)
    addToCart("Coke", 10)
}

fun addToCart(key: String, value: Int): Unit {
    var suffix: Int = 0
    var newKey: String = key

    while (newKey in cart) {
        newKey = newKey + "_" + suffix.toString()
        suffix++
    }
    cart.put(newKey,value)
}

fun checkOut(): Int {
    var itemsCheckedOut: Int = 0
    for (value in cart.values) {
        itemsCheckedOut += value
    }
    return itemsCheckedOut
}

fun removeFromCart(key: String) {
    var suffix: Int = 0
    var newKey: String = key
    do {
        cart.remove(newKey)
        newKey = newKey + "_" + suffix.toString()
        suffix++
    }while (newKey in cart)
}