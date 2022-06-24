package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    println("-------------------")
    for (valor in values) {
        println(valor)
    }
    println("-------------------")
    values.forEach {//Utilizando forEach é o mesmo que a função acima com a variavel 'valor'
        println(it) //forEach percorre a lista e 'it' faz o papel da variavel local
    }
    println("-------------------")
    for(index in values.indices){//indices pega o indice e exibe o valor alocado naquela posição
        println(values[index])
    }
    println("-------------------")
    values.sort() //'sorte' exibe numeros em ordem crescente em uma lista
    for (valor in values){
        println(valor)
    }
}