fun main(){
    val isMarrried  = false
    val GPA = 3.8

    val isQualified = if (isMarrried && GPA>=3.8) 1 else 0

    println(isQualified)

    val isGood =  when(GPA){
        4.0 -> true
        else -> false
    }

    println(isGood)
}