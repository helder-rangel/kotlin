package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Helder"
    var cpf: String = "123.123.123-11"
}

fun main(){
    val helder= Pessoa()

    println(helder.nome)
    println(helder.cpf)
}