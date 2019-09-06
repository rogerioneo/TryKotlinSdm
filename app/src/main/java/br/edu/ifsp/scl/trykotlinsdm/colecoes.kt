package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // List (imutável) / MutableList (mutável)
    var familia: List<String> = listOf("Rogério", "Danielli", "Pedro", "Paulo") // Ou listOf<String>()

    // Percorrendo a lista com for
    for (integrante in familia){
        println(integrante)
    }
}