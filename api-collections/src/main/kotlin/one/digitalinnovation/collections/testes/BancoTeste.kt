package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Banco


    fun main(){
        val digiOneBank = Banco("Digione",12)

        println(digiOneBank.nome)
        println(digiOneBank.numero)


        val banco2 = digiOneBank.copy("Banco2")
        println(banco2.info())

    }