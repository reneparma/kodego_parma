package activity_01j.activity_01_j


fun main() {
    var books = arrayOf<String>("A Time to Kill", "The House of Mirth","East of Eden","The Sub Also Rises","Vile Bodies")
    var durationDays = arrayOf<Int>(7,5,7,4,9)

    var borrower = arrayListOf<String>()
    var borrowedBooks = arrayListOf<String>()
    var borrowedDuration = arrayListOf<Int>()

    println("Welcome to ELibrary:")
    for(i in 1..books.size){
        println("$i " + books[i-1])
    }

    println("Please select the book you want to borrow? 1-5")
    var selection: Int = Integer.valueOf(readLine())

    println("Please Enter your name: ")
    var borrowername = readLine().toString()

    borrower.add(borrowername)
    borrowedBooks.add(books[selection])
    borrowedDuration.add(durationDays[selection])

    println("Name of Borrower: ${borrower.get(0)}")
    println("Book Title: ${borrowedBooks.get(0)}")
    println("Duration: ${borrowedDuration.get(0)} Day(s)")
}