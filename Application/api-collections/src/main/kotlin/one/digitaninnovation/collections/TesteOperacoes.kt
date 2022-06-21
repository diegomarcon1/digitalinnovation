package one.digitaninnovation.collections

fun main(){
    val salarios = doubleArrayOf(1500.0, 2700.0, 3300.0)
    for (salario in salarios){
        println(salario)
    }
    println("-------------")
    println("Maior salario : ${salarios.max()}") //Busca e exibe o maior valor
    println("Menor salario : ${salarios.min()}") //Busca e exibe o menor valor
    println("Media dos salarios :${salarios.average()}") //Faz a media dos valores e imprime

    println("-------------")
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 } //A função 'filter' faz um filtro conforme valor indicado
    salarioMaiorQue2500.forEach{
        println(it)
    }

}