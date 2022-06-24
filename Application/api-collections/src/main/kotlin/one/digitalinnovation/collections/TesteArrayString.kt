package one.digitalinnovation.collections

fun main(){
    val nomes = Array(4){""}
    nomes[0] = "Maria"
    nomes[1] = "Patricia"
    nomes[2] = "Karol"
    nomes[3] = "Gaby"
    for(nome in nomes){
        println(nome)
    }
    println("------------------")
    nomes.sort()
    nomes.forEach {
        println(it) }

    println("------------------")
    val nomes2 = arrayOf("Ana", "Maria", "Patricia")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}