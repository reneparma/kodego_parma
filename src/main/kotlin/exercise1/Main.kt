package exercise1

class Main {
    fun main(){
        var PositionApplyingFor: String = "Web Developer"
        var DesiredSalary: Int = 20000
        var DateAvailableForWork: String

        //Personal Information
        var LastName:  String = "Johnny"
        var FirstName: String = "Ahh"
        var MiddleName: String = "Yu"
        var Age: Int = 28
        var BirthDate: String = "February 1, 1994"
        var Address: String = "Magsaysay Avenue"
        var City: String = "Naga City"
        var State: String = ""
        var ZipCode: Int = 4403
        var HomePhone: Int?
        var CellphoneNumber: String = "+639546252652L"
        var EmailAddress: String = "johnnyahh@gmail.com"
        var Social_Security_Number: Int = 121463235
        var Is_US_Citizen: Boolean = false
        var Is_Convicted_of_Felony: Boolean = false
        var Is_Willing_to_Submit_Drug_Test: Boolean = true

        //Education
        var SchoolName: String = "Ateneo de Naga University"
        var Location : String = "Naga City"
        var YearsAttended: String = "2011-2015"
        var DegreeReceived: String = "Bachelor of Science in Elementary Education"
        var Major: String = "Math"

        fun isUnderAge(age: Int){
            if(age in 1..17){
                println("Sorry but you are under age to work.")
            }else if(age < 1){
                println("Age is invalid.")
            }else{
                println("Your information was submitted")
            }
        }

        // Check if Under Age
        isUnderAge(Age)

    }
}