package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {//pegta os valores da lista em ordem declarada
        println(it)
    }
    println("-------------------------")
    values.sort() //ordena os valores declarados em ordem crescente
    values.forEach {
        println(it)
    }
}