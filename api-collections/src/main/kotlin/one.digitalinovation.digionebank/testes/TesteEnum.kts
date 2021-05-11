package one.digitalinnovation.digionebank.testes

fun main(){
    ClienteTipo.values().forEach{ elemento->
        println("${elemento.name}-${elemento.toString()}")
    }
    ClienteTipo.values().forEach{ it->
        println("${it.name}-$it")
    }
}
