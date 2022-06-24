package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1500.0, 2700.0, 3300.0)
    for (salario in salarios){
        println(salario)
    }
    println("-------------")
    println("Maior salario : ${salarios.maxOrNull()}") //Busca e exibe o maior valor **(Foi refatorado de 'max' 'para maxOrNull')
    println("Menor salario : ${salarios.minOrNull()}") //Busca e exibe o menor valor **(Foi refatorado de 'min' 'para minOrNull')
    println("Media dos salarios :${salarios.average()}") //Faz a media dos valores e imprime

    println("-------------")
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 } //A função 'filter' faz um filtro conforme valor indicado
    salarioMaiorQue2500.forEach{
        println(it)
    }
    println("-------------")
    println(salarios.count{it in 2000.0..5000.0})//Contar valores utilizando o 'count' dentro de um range '2000.0..5000.0'

    println("-------------")
    println(salarios.find{it == 2700.0}) //Buscando um valor exato e imprimir na tela
    println(salarios.find{it == 200.0}) //O valor sera 'null' pois não há este valor na lista

    println("-------------")
    println(salarios.any{it == 2000.0}) //Exibe 'true' or 'false' se for encontrado o valor ou não

}