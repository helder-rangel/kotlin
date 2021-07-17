package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Helder"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val helder= Pessoa()

    println(helder.nome)
    println(helder.cpf)
    println(helder.pessoaInfo())
}