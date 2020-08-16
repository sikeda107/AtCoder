fun main(args: Array<String>) {
    val inputN = readLine()!!.toInt()
    val inputA = readLine()!!.split(" ").map(String::toInt)
    var counter = 0
    var targetList = inputA
    while(targetList.all{it % 2 == 0}){
        targetList = targetList.map{ it / 2}
        counter += 1
    }
    println(counter)
}