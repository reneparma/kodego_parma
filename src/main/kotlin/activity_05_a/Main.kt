package activity_05_a

import java.util.*

fun main(){

}
 open class Person(
     val firstname: String,
     val middlename: String,
     val lastname: String,
 ){
     var address: String = ""
     var birthday: Date = Date()
}

open class Student(
    firstname: String,
    middlename: String,
    lastname: String,
):
    Person(
        firstname,
        middlename,
        lastname){

       var yearEntered: Date = Date()
        var id : Int = 0

}

class CertificateStudent(
        firstName: String,
        middleName: String,
        lastName: String,
        status: Status = Status.UNKNOWN):
    Student(firstName, middleName, lastName) {

    var shortCourses: ArrayList<String> = ArrayList()
}

class UnderGraduateStudent(firstName: String, middleName: String, lastName: String, status: Status = Status.UNKNOWN):Student(firstName, middleName, lastName), CollegeData {
    override var college: String = ""
        get() = field
        set(value) {
            field = value
        }
    override var collegeStart: Date = Date()
        get() = field
        set(value) {
            field = value
        }
    override var degrees: ArrayList<String> = ArrayList()
        get() = field
        set(value) {
            field = value
        }
    override var collegeEnd: Date? = null
        get() = field
        set(value) {
            field = value
        }
    override var statuses: ArrayList<Status> = ArrayList()
        get() = field
        set(value) {
            field = value
        }
}

interface CollegeData {
    var college: String
    var collegeStart: Date
    var degrees: ArrayList<String>
    var collegeEnd: Date?
    var statuses: ArrayList<Status>
}

interface MastersData {
    var college: String
    var collegeStart: Date
    var degree: String
    var collegeEnd: Date?
}

class MasterStudent(firstName: String,
                    middleName: String,
                    lastName: String,
                    status: Status = Status.UNKNOWN):
    Student(firstName, middleName, lastName), MastersData {
    override var college: String = ""
        get() = field
        set(value) {
            field = value
        }
    override var collegeStart: Date = Date()
        get() = field
        set(value) {
            field = value
        }
    override var degree: String = ""
        get() = field
        set(value) {
            field = value
        }
    override var collegeEnd: Date? = null
        get() = field
        set(value) {
            field = value
        }

}

class GraduateStudent(
        firstName: String,
        middleName: String,
        lastName: String,
    status: Status = Status.UNKNOWN):Student(
        firstName,
        middleName,
        lastName) {
}

enum class Status {
    LEAVE_OF_ABSENCE,
    ONGOING,
    GRADUATED,
    WILL_BEGIN,
    UNKNOWN,
    SHIFTED
}