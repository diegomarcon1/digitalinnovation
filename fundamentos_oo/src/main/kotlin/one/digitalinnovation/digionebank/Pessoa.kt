package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Diego"
    var cpf: String = "123.456.789-12"
    private set //Sera privado somente o set e não o get dentro desta funcao Pessoa

    constructor()

    fun nomeCPF() = "$nome e $cpf"
}
fun main(){
    val Diego = Pessoa()
    println(Diego.nomeCPF())


}