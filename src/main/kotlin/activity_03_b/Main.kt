package activity_03_b

fun main(){
    var bookTitles = arrayListOf<String>("Foreigner With Immortality",
                                        "Duke Without Hate",
                                        "Dogs Of Greatness",
                                        "Strangers Of The Plague",
                                        "Friends And Agents",
                                        "Humans And Mice",
                                        "Ruins Of The River",
                                        "Sword Of Nightmares",
                                        "Still Breathing In Eternity",
                                        "Going To The Ashes",
                                        "Stranger Of Secrets",
                                        "Queen With Pride",
                                        "Warlocks Of The End",
                                        "Criminals Of Nightmares",
                                        "Ghosts And Animals",
                                        "Assassins And Trees",
                                        "Coffin Of The Gods",
                                        "Burial Of Hope",
                                        "Screams In My Enemies",
                                        "Bound To The Ships")

    fun isBookInRecord(title: String): Boolean{
        var active: Boolean = false
        for(i in 1..bookTitles.size){
            if (title.equals(bookTitles[i-1],ignoreCase = true)){
                println("Title found in the list")
                active = true
            }
        }
        return active
    }

    fun addBook(title: String){
        bookTitles.add(title)
        println("1 Book Added")
    }

    fun removeBook(title: String){
        for(i in 1..bookTitles.size){
            if (title.equals(bookTitles[i-1],ignoreCase = true)){
                bookTitles.removeAt(i-1)
                break
            }
        }
    }

    fun countBooks(): Int{
        return bookTitles.size
    }

    fun searchBookWildSearch(title: String): List<String>{
        var searchedBook = listOf<String>()
        searchedBook = bookTitles.filter{it.lowercase().contains(title)}
        return searchedBook
    }

    fun searchBookName(title: String): ArrayList<String>{
        var foundBook = arrayListOf<String>()
        for(i in 1..bookTitles.size){
            if (title.equals(bookTitles[i-1],ignoreCase = true)){
                foundBook.add(bookTitles[i-1])
                println("Name found in the list")
            }
        }
        return foundBook
    }

    fun showBooks(){
        for(i in 1 .. bookTitles.size){
            println(bookTitles[i-1])
        }
    }
}
