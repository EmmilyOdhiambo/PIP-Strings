fun main() {
  println(  personaDetails("Stephanie", 20, "Kenya"))
    println(stringLength("Software Developer"))
    massage("Stephanie")
    println(replaceVowel("Beautiful Lady"))



}
//Write a function that takes in 3 parameters, name, age, and country, and returns a
// String with this structure “Hi, my name is x, I am y years old and I am from z.”
// Where x, y, and z are the provided name, age, and country respectively.

fun personaDetails (name:String,age:Int,country:String):String{
    var sentence = "Hi, my name is $name I am $age years old and I am from $country"
    return sentence

}
//Write a function that takes in a String and returns its length
fun stringLength (word: String):Int{
    var career = "Software Developer"
    return career.length
}
// Write a function that takes in a name and prints out “That’s me!” when your name is passed to it,
// otherwise, it prints out “I don’t know who that is”
fun massage(name: String){
    var myName = "Steph"
    if (name.equals (myName)){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }


}
//Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output.
fun replaceVowel (word:String): String {
    var vowel = "AEIOUaeiou"
    var answer = ""

    for (w in word) {
        if (w in vowel) {
            answer += "*"
        } else {
            answer += w
        }
    }
    return "org: $word new: $answer"

}




