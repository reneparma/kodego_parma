package activity_05_c

open class Products(name: String, price: Double,size: Char){
    var name = name
    var price = price
    var size = size
}

class Fruit (name: String, price: Double, origin: String,size: Char): Products(name,price,size){
    var origin = origin
}

class Milk (name: String, price: Double, size: Char): Products(name,price,size){

}

class BottledWater(name: String, price: Double, size: Char): Products(name,price,size){


}

class Crackers(name: String, price: Double, size: Char): Products(name,price,size){


}