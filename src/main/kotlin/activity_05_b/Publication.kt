package activity_05_b

import java.util.*

open class Authors(firstName: String, middleName: String, lastName: String) {
    val firstName: String = firstName
    val middleName: String = middleName
    val lastName: String = lastName
    var dateOfBirth: Date = Date()
}

open class Publication(publisherName: String,datePublished: String){

}

class Book(publisherName: String,
           datePublished: String,
           title: String,
           author: Authors,
           pages: Int):
    Publication(publisherName,
                datePublished){

}

class Magazine(publisherName: String,
               datePublished: String,
               title: String,
               category: String,
               pages: Int) :
    Publication(publisherName,
                datePublished){

}

class Newspaper(publisherName: String,
                datePublished: String,
                headline: String,
                article: String,
                author: Authors,
                pages: Int,
                king: kindOfAV = kindOfAV.Unknown) :
    Publication(publisherName,
                datePublished){

}
class Comics(publisherName: String,
             datePublished: String,
             title: String,
             illustrators: Illustrator):
    Publication(publisherName,
                datePublished){
    }

class Illustrator(firstName: String,
                  middleName: String,
                  lastName: String): Authors(firstName, middleName, lastName) {
}

class Audio_Video_Material(publisherName: String,
                           datePublished: String,
                           title: String,
                           duration: Double):
                Publication(publisherName,
                            datePublished){

}
enum class kindOfAV {
    Recordings, Documentary, Movies, Powerpoint,Unknown
}