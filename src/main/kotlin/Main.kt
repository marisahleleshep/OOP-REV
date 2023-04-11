fun main(){

    var attribute=Human("Kaimenyi",54,108)
        attribute.eat(2)
    println(attribute.weight)
    attribute.speak("I know how to code")
    attribute.birthday()

    var names=User(  "Hunter",
        "Achieng",
        "achieng@gmail.com",
        "0712454398",
        3445567

    )
    println(names.firstName)
//    println(names.lastName)
    println(names.password)

    var add=Rectangle(23,78)
   println(add.getArea())


    var gari=Cars("Benz","Leaf","K254",840)
    gari.speed
   println(gari.speed)
    gari.accelerate(433)
   println(gari.accelerate(433))


}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
class User(var firstName: String,var lastName: String,var email:String,var phoneNumber: String,var password:Int){


}

class Cars(var make:String,var model:String,var registration:String,var speed:Int){

    public fun start() {
        println("I am starting")
    }
    public fun accelerate(acceleration: Int): Int {
        speed + acceleration
        return speed
    }
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
//        println("I am eating $foodWeight")
        weight+=foodWeight

    }

     //speak(speech: String) :Prints the string passed to it
    fun speak(speech:String){
        println(speech)

    }

    // birthday( ) :Increments the human’s age by 1
    fun birthday(){
        age++
        println(age)
    }
}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class Users(
    var firstName: String,
    var lastName: String,
    var email: String,
    var phoneNumber: String,
    var password: Int
)

//Create a class Rectangle that has two properties length and width,
//and a method getArea() that calculates the area of the rectangle.
//Use constructor parameters to set the values of length and width when an object is created.

class Rectangle(var length:Int,var width:Int){
    fun getArea():Int{
       return length*width
    }
}


















