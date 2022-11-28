package activity_04_b

class Books(title: String, year_published: String, author: Authors) {
    val title: String = title
    val author: Authors = author
    var yearPublished: String = year_published
    var edition: String = ""
    var isbn: String = ""
    lateinit var publisher: Publisher
    val chaptersList: ArrayList<String> = ArrayList()
    var numberOfPages: Long = 0L
}

class Magazines(title: String,month_published: String,year_published: String, editor: Authors) {
    val title: String = title
    val editor: Authors = editor
    var monthPublished: String = month_published
    var yearPublished: String = year_published
    val articles: ArrayList<Article> = ArrayList()
}

class Newspaper(name: String,day_published: String,month_published: String,year_published: String,headline: String) {
    val name: String = name
    var headline: String = ""
    var columnists: ArrayList<Authors> = ArrayList()
    var dayPublished: String = day_published
    var monthPublished:String =  month_published
    var yearPublished: String = year_published
    val articles: ArrayList<Article> = ArrayList()
}

open class Authors(firstname: String, middlename: String, lastname: String, dob: String) {
    val firstName: String = firstname
    val middleName: String = middlename
    val lastName: String = lastname
    var dateOfBirth: String = dob
}

class Comics(title: String,month_published: String, year_published: String,  vararg illustrators: Illustrator){
    val title: String = title
    val illustrators: ArrayList<Illustrator> = arrayListOf(*illustrators)
    lateinit var publisher: Publisher
    var monthPublished: String = month_published
    var yearPublished: String = year_published
}

class Illustrator(firstName: String, middleName: String, lastName: String,dob:String): Authors(firstName, middleName, lastName,dob) {
}

class Article(title: String, author: Authors) {
    val title: String = title
    val author: Authors = author
    var content: String = ""
}

class Search() {

    fun searchBookWildSearch(input: String, titleList: ArrayList<String>): ArrayList<String> {
        var matchBookNames: ArrayList<String> = ArrayList()
        for (bookName in titleList) {
            if (input.lowercase() in bookName.lowercase()) {
                matchBookNames.add(bookName)
            }
        }
        return matchBookNames
    }

    fun searchBookName(input: String, titleList: ArrayList<String>): ArrayList<String> {
        var matchBookNames: ArrayList<String> = ArrayList()
        if (input in titleList) {
            matchBookNames.add(input)
        }
        return matchBookNames
    }
    fun titleSearch(searchString: String, magazineList: ArrayList<Magazines>, newspaperList: ArrayList<Newspaper>, comicsList: ArrayList<Comics>): ArrayList<String> {
        var searchResults: ArrayList<String> = ArrayList()
        var searchFrom: ArrayList<String> = ArrayList()
        magazineList.forEach {
            searchFrom.add(it.title)
        }
        newspaperList.forEach {
            searchFrom.add(it.headline)
        }
        comicsList.forEach {
            searchFrom.add(it.title)
        }
        when(searchString.length) {
            0 -> {
                println("Invalid Input")
            }
            in 1 until 3 -> {
                searchResults = searchBookWildSearch(searchString, searchFrom)
            }
            else -> {
                searchResults = searchBookName(searchString, searchFrom)
            }
        }
        return searchResults
    }

    fun listOfWorks(author: Authors, magazineList: ArrayList<Magazines>, newspaperList: ArrayList<Newspaper>, comicsList: ArrayList<Comics>): ArrayList<String> {
        var works: ArrayList<String> = ArrayList()
        magazineList.forEach {
            if (author == it.editor) {
                works.add(it.title)
            }
        }
        newspaperList.forEach {
            it.columnists.forEach { itAuthor ->
                if (author == itAuthor) {
                    works.add(it.headline)
                }
            }
        }
        comicsList.forEach {
            it.illustrators.forEach { itIllustrator ->
                if (author == itIllustrator) {
                    works.add(it.title)
                }
            }
        }
        return works
    }
}

class AudioVideoRecording(title: String, publisher: String, date_recorded: String) {
    val title: String = title
    val publisher: String = publisher
    var lengthInHours: Double = 0.0
    var dateRecorded: String = date_recorded
    var hasVideo: Boolean = false
    var hasAudio: Boolean = false
}

open class Publisher(name: String, date: String) {
    val name: String = name
    var address: String = ""
    var date: String = date
}