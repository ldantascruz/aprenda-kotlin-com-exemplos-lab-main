# aprenda-kotlin-com-exemplos-lab
Kotlin challenge for dio bootcamp

This is a simple course management system implemented in Kotlin language. This code was created as a challenge for a DIO (Digital Innovation One) bootcamp.

### Functionalities
The system allows the following actions:

*  Create courses with a name, level, list of educational content, start and end date, instructor name, and contact info
* Enroll users in a course
* Unenroll users from a course
* Get the list of enrolled users in a course
* Get the total duration of a course (in minutes)
* Get the list of educational content in a course
* Print the list of enrolled users in a course
* Print the total duration of a course
* Print the list of educational content in a course, as well as start and end dates and instructor information.

### Code Overview
The code consists of four classes and a main function:

* User: A class that represents a user of the system, with only a name attribute.
* EducationalContent: A data class that represents a piece of educational content, with a name, duration in minutes, and a description (which is optional).
* Course: A class that represents a course, with a name, level (basic, intermediate or difficult), a list of educational contents, start and end dates, instructor name, contact info, and a list of enrolled users.
* Level: An enum class that represents the level of a course.
* main: A function that creates users, educational contents and courses, enrolls users in courses, and prints information about the courses.
