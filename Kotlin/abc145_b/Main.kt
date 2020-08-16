fun main(args: Array<String>) {
    var result :String = "No"

    var input = readLine()!!
    val inputN = if (Regex(pattern = "^[0-9]+$").containsMatchIn(input)) input.toInt() else 0
    input = readLine()!!
    val inputS = if (Regex(pattern = "^[a-z]+$").containsMatchIn(input)) input else ""

    if( inputN >= 1 && inputN <= 100 && inputN == inputS.length){
        val firstHalf = inputS.substring(0..(inputN / 2 - 1))
        val secondHalf = inputS.substring((inputN / 2)..(inputN - 1))
        if(firstHalf == secondHalf){
            result = "Yes"
        }
    }
    println(result)
}