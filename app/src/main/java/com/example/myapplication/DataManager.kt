package com.example.myapplication

class DataManager {
    //this will server as a central point of managing instances for the courseinfo and noteinfo classes created
    //DataManager class won't need a primary constructor but it will need some properties
    //you need a property to hold a collection of courses and a property to hold a collection of notes
    //Kotlin has a variety of collection classes and we will use some here
    //for courses we will use a collection that makes it easy for us to lookup courses by the CourseID therefoe use Hashmap!
    //hashmap is a generic type (same in other languages) which allows us to specify the specific type we want to use within the type
    val courses = HashMap<String,CourseInfo>()
    //the first type parameter in hashmap will be used for lookups - since we are using courseid for lookups then that is a string
    // the second type of parameter is the one to be stored - in our case it is the course info which is of type courseInfo
    //this will take care of creating new instances of our Hashmap, the hashmap maps string values to instances of our courseinfo class and a reference of that hashmap is assigned to our courses property
    val notes = ArrayList<NoteInfo>()
     //no lookups are needed for the notes here and we will use the Arraylist collection

    init{
        initialiseCourses()
        //anytime an instance of our datamanager class is created, the code within the init bock will automatically run and populates our collection of courses for us
        //init blocks accept no parameters because there's no way to call them explicitly. they run automatically as part of instance creation
        //inti block can access the parameters of our primary constructor as well as properties within the class
        //in Kotlin type initialisation occurs through a combination of the type's primary constructor which provides the initialisation values along with the code that runs inside of our initialiser blocks
        //initialiser block provides initialisation code and  primary constructor provides the initialisation values
    }
    private fun initialiseCourses(){
    //by default in Kotlin all members are visible unless we state otherwise
    // for this function we don't anything from outside this class to call it so we label it as 2private"
    var course = CourseInfo("android_intents","Android Programming with intents" )
    courses.set(course.courseID, course)


     course = CourseInfo(courseID = "android_async", title = "Android Async Programming and Services")
     courses.set(course.courseId, course)

     course = CourseInfo("Java fundamentals: The Java Language", "Java_Lang")
     courses.set(course.courseId, course)

     course = CourseInfo("Java_Core", "Java Fundamentals: The Core Platform")
     courses.set(course.courseId, course)
     //we need to add a code that runs  this function whenever an instance of DataManager class is created and we can do that with an initializer block
     }



}