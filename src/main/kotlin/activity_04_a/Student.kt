package activity_04_a

class Student (firstName: String, lastName: String,nickname:String, id: String, year: Int){
    var firstName: String = firstName
    var lastName: String = lastName
    var id: String = id
    var year: Int = year
    var nickname: String = nickname

    fun addStudent(students: ArrayList<Student>) {
        students.add(this)
    }
}

class StudentSearch(studentList: ArrayList<Student>) {
    var students: ArrayList<Student> = studentList

    fun searchStudentWildSearch(searchName: String): HashSet<Student> {
        var matchNames: HashSet<Student> = HashSet()
        for (index in students.indices) {
            if (searchName.lowercase() in students[index].firstName.lowercase() ||
                searchName.lowercase() in students[index].lastName.lowercase()) {
                matchNames.add(students[index])
            }
        }
        return matchNames
    }

    fun searchStudentWildSearch(searchName: String,
                                searchParameter: String): HashSet<Student> {

        val matchNames: HashSet<Student> = HashSet()
        val searchParameter: String = searchParameter
        when(searchParameter) {
            "firstname" -> {
                for (index in students.indices) {
                    if (searchName.lowercase() in students[index].firstName.lowercase()) {
                        matchNames.add(students[index])
                    }
                }
            }
            "lastname" -> {
                for (index in students.indices) {
                    if (searchName.lowercase() in students[index].lastName.lowercase()) {
                        matchNames.add(students[index])
                    }
                }
            }
            "nickname" -> {
                for (index in students.indices) {
                    if (searchName.lowercase() in students[index].nickname.lowercase()) {
                        matchNames.add(students[index])
                    }
                }
            }
            else -> println("Did not match any student!!")
        }
        return matchNames
    }
}