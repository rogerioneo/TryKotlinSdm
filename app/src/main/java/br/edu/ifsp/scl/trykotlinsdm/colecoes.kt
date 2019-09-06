package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // List (imutável) / MutableList (mutável)
    var familia: List<String> = listOf("Rogério", "Danielli", "Pedro", "Paulo") // Ou listOf<String>()

    // Percorrendo a lista com for
    for (integrante in familia){
        println(integrante)
    }

    // Lista de inteiros
//    val listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
    val listaInteiros: List<Int> = (1..10).toList()

//    listaInteiros.add(11) //Erro - Lista imutável
//    listaInteiros = listOf() //Erro - referência é imutável

    //Percorrer com for usando IntRange
    for (i in 0..9){
        println(listaInteiros[i])
    }

    val listaInteiros2: List<Int> = (1..10 step 2).toList()
    for (lista in listaInteiros2){
        println(lista)
    }
}