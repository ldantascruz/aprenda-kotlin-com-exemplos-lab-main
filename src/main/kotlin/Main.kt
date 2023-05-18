import java.time.LocalDate

enum class Level { BASIC, INTERMEDIATE, DIFFICULT }

class User(val name: String)

data class EducationalContent(val name: String, val durationInMinutes: Int = 60, val description: String)

class Course(val name: String, var level: Level, var contents: List<EducationalContent>,
             var startDate: LocalDate, var endDate: LocalDate, var instructor: String, var contactInfo: String) {

    private val enrolledUsers = mutableListOf<User>()

    fun enroll(user: User) {
        enrolledUsers.add(user)
        println("User ${user.name} enrolled in education $name")
    }

    fun unenroll(user: User) {
        enrolledUsers.remove(user)
        println("User ${user.name} unenrolled from education $name")
    }

    fun getListEnrolledUsers(): List<User> {
        return enrolledUsers
    }

    fun getTotalDuration(): Int {
        return contents.sumOf { it.durationInMinutes }
    }

    fun getEducationContents(): List<EducationalContent> {
        return contents
    }

    fun printEnrolledUsers() {
        println(
            "Enrolled users in course '${this.name}': ${
                this.getListEnrolledUsers().joinToString(", ") {
                    "\n     - " + it.name
                }
            }"
        )
    }

    fun printDuration() {
        println("Total duration of course '${this.name}': ${this.getTotalDuration()} minutes")
    }

    fun printDescription() {
        println(
            "Contents included on course '${this.name}': ${
                this.getEducationContents().joinToString(", ") {
                    "\n     - " + it.name + ", duration: " + it.durationInMinutes + "minutes"
                }
            }"
        )
        println(
            "Starting date: $startDate, ending date: $endDate"
        )
        println(
            "Instructor information for '${this.name}': name: $instructor, e-mail: $contactInfo"
        )
    }
}

fun main() {
    val user1 = User("Dane Hartman")
    val user2 = User("Robin Berry")
    val user3 = User("Morgan Chaney")

    val content1 = EducationalContent("Introduction to Kotlin",
        120,
        "Learn the basics of Kotlin programming language"
    )
    val content2 = EducationalContent(
        "Object-Oriented Programming in Kotlin",
        description = "Understand the principles of OOP in Kotlin"
    )
    val content3 = EducationalContent("Android Development with Kotlin - first steps",
        180,
        "Build Android apps using Kotlin"
    )

    val startDate = LocalDate.of(2023, 5, 1)
    val endDate = LocalDate.of(2023, 5, 31)

    val course1 = Course(
        "Kotlin For Beginners",
        Level.BASIC,
        listOf(content1, content2),
        startDate,
        endDate,
        "John Doe",
        "john.doe@dio.me"
    )
    val course2 = Course(
        "Native Android Development",
        Level.DIFFICULT,
        listOf(content1, content2, content3),
        startDate,
        endDate,
        "Alisha Wood",
        "alisha.wood@dio.me"
    )

    course1.enroll(user1)
    course1.enroll(user2)
    course2.enroll(user2)
    course2.enroll(user3)

    course1.printEnrolledUsers()
    course1.printDuration()
    course1.printDescription()

    course2.printEnrolledUsers()
    course2.printDuration()
    course2.printDescription()

}
   
