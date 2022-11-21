package acitivity_03_a

fun main(){
    var studentNames = arrayListOf<String>("Arielle","Will","Reilly","Rex","Renee","Ramiro","Javion","Zachary","Brenda","Larissa","Chloe","Mckinley","Connor",
        "Ashly","Mason","Rubi","Morgan","Vanessa","Elise","Marissa")

    fun isStudentInRecord(name: String): Boolean {
        var active: Boolean = false
        for(i in 1..studentNames.size){
            if (name.equals(studentNames[i-1],ignoreCase = true)){
                println("Name found in the list")
                active = true
            }
        }
        println(active)
        return active
    }

    fun addStudent(name: String){
        studentNames.add(name)
        println("1 Student Added")
    }

    fun removeStudent(name:String){
        for(i in 1..studentNames.size){
            if (name.equals(studentNames[i-1],ignoreCase = true)){
                studentNames.removeAt(i-1)
                break
            }
        }
    }

    fun countStudent(): Int{
        return studentNames.size
    }

    fun searchStudentWildSearch(name: String): List<String>{
        var searchedStudent = listOf<String>()
        searchedStudent = studentNames.filter{it.lowercase().contains(name)}
        return searchedStudent
    }

    fun searchStudentName(name: String): ArrayList<String>{
        var foundStudent = arrayListOf<String>()
        for(i in 1..studentNames.size){
            if (name.equals(studentNames[i-1],ignoreCase = true)){
                foundStudent.add(studentNames[i-1])
                println("Name found in the list")
            }
        }
        return foundStudent
    }

    fun searchStudent(name: String){
        if(name.length >= 3){
            searchStudentWildSearch(name)
        }else if (name.length > 3){
            searchStudentName(name)
        }
    }

    fun showStudents(){
        for(i in 1 .. studentNames.size){
            println(studentNames[i-1])
        }
    }

    showStudents()
}