package activity_04_a

fun main() {
    val students: ArrayList<Student> = ArrayList()
    val wildSearch: StudentSearch = StudentSearch(students)
    var result: HashSet<Student> = HashSet()

    val rene: Student = Student("Rene", "Parmz","Doy", "123456", 2011)
    val ray: Student = Student("Ray", "Stone","Ray", "123456", 2012)
    val ralph: Student = Student("Ralph", "Vin", "Rap","123456", 2008)
    val dey: Student = Student("Dey", "Cruz", "Dey","123456", 2017)
    val dan: Student = Student("Dan", "Dane", "Dani Boy","123456", 2014)


    rene.addStudent(students)
    ray.addStudent(students)
    ralph.addStudent(students)
    dey.addStudent(students)
    dan.addStudent(students)

    println("Students")
    students.forEach { println("${it.lastName}, ${it.firstName}") }

    result = wildSearch.searchStudentWildSearch("y")
    result.forEach { println("${it.lastName}, ${it.firstName}") }

    println("------Last Name------")
    result = wildSearch.searchStudentWildSearch("y", "lastname")
    result.forEach { println("${it.lastName}, ${it.firstName}") }

    println("------First Name------")
    result = wildSearch.searchStudentWildSearch("y", "firstname")
    result.forEach { println("${it.lastName}, ${it.firstName}") }

    println("------Nickname------")
    result = wildSearch.searchStudentWildSearch("y", "nickname")
    result.forEach { println("${it.lastName}, ${it.firstName}") }
}