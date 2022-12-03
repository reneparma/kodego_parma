package activity_05_c

fun main(){
    var items = ArrayList<Item>()

    fun display(){
        items.forEach{
            println(it.name)
        }
    }

    fun addToCart(item: Item){
        items.add(item)
    }

    fun removeItem(id: Int) {
        for (i in items.indices) {
            if (id == items[i].id) {
                items.remove(items[i])
                break
            }
        }
    }

     fun checkOut(): Double{
         var total: Double = 0.0
         for (i in items.indices) {
            total+= items[i].price * items[i].qty
         }
         return total
     }

    var absolute = BottledWater("Absolute",20.00,'s')
    var apple = Fruit("Apple",25.00,"USA", 's')
    var magnolia = Milk("Fresh Milk",50.00,'s')

    var item1 = Item(1,absolute.name, absolute.price, absolute.size,10)
    var item2 = Item(2,apple.name,apple.price,apple.size, 5)
    var item3 = Item(3,magnolia.name,magnolia.price,magnolia.size,3)

    addToCart(item1)
    addToCart(item2)
    addToCart(item3)

    display()
    println(checkOut())
}

class Item(id: Int, name: String, price: Double,size: Char, qty: Int){
    var id = id
    var name = name
    var price = price
    var size = size
    var qty = qty
}