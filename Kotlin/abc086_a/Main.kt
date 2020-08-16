fun main(args: Array<String>) {
    val inputList = readLine()!!.split(" ").map(String::toInt)
    if(inputList[0] % 2 ==  0 || inputList[1] % 2 ==  0 ){
        println("Even")
    }
    else{
        println("Odd")
    }
}