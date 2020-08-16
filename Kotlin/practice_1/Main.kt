fun main(args: Array<String>) {
    val inputA = readLine()!!.toInt()
    val inputBC = readLine()!!.split(" ").map(String::toInt)
    val inputS = readLine()!!

    println("${inputA + inputBC[0] + inputBC[1]} ${inputS}")
}