package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)//Bunca os tipos de dados de nome e numero da classe Banco
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")
    println(banco2.nome)
    println(banco2.numero)
}
