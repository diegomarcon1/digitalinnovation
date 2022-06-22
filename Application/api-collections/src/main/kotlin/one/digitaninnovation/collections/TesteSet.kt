package one.digitaninnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("--------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2) //Subtract retira o que tem de valor em comum(iguais)
    resultSubtract.forEach{ println(it)}

    println("--------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2) //Exibe valores iguais nas duas listas, neste caso é a Maria
    resultIntersect.forEach{ println(it)}
}