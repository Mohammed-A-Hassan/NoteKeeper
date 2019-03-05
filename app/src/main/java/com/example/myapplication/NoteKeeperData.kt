package com.example.myapplication
// We will add the classes related to our data model to this file
// The first class we need to add is the class related to our module
class CourseInfo (val courseID: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

// courseid and titleid won't change from our app point of view - they are assigned once "val" properties!
//by addind val in between the brackets at the header of the class will mean we don't have to mention the properties again in the body of the class
// because the class now does not have any body so we don't need the curly braces anymore and the class is declared entirely in a single line
class NoteInfo(var course: CourseInfo, var title: String, var text: String)
// we add the var keyword to make "course" a property
//we choose var because we might want to change the name of a course the ntoe is associated with
//courseInfo is inherited from the class above https://www.callicoder.com/kotlin-inheritance/
//the class that inherits is called child, derived or subclass
//while parent class could be called base, parent or super class
//THE ABOVE TWO CLASSES ARE USED TO REPRESENT DATA WITHIN OUR APP
