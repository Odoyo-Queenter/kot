fun main() {
    name("Queenter")
    var y = reminder(30,4)
    println(y)
    var q = addition(100,200,300,400)
    println(q)
    fact("i am empathetic")
}
fun name(name: String){
println("Hello $name")

}
fun reminder(numb1:Int,numb2:Int):Int {
    var modulus = numb1 % numb2
    return modulus
}
fun addition(numb1:Int,numb2:Int,numb3:Int,numb4:Int):Int{
    var sum = numb1 + numb2 + numb3 + numb4
    return sum
}
fun fact(fact:String){
    println("i am empathetic")
}