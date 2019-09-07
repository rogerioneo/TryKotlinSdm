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

    //forEach - lambda
    listaInteiros2.forEach { println(it) }
    listaInteiros2.forEach { x -> println(x) }

    var aList: ArrayList<String> = ArrayList() // Utiliza o ArrayList do java util

    // lista Mutável
    val listaCursos: MutableList<String> = mutableListOf("Análise e Desenvolvimento de Sistemas",
            "Sistemas para Disposistivos Móveis")

    listaCursos.add("Técnico em Informática para Internet")

    listaCursos.forEach { println(it) }

    //listaCursos = MutableListOf() // Erro - porque a referencia não é mutável

    // Set e MutableSet - Não permite itens reptidos
    val setCursos: MutableSet<String> = mutableSetOf("ADS", "SDM", "TII")

    setCursos.add("ADS") // Não é adicionado, não permite itens reptidos
    setCursos.add("SDM") // Não é adicionado, não permite itens reptidos

    setCursos.forEach { println(it) }

    // Map e MutableMap
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Rogério"),
            Pair("Mãe", "Danielli"), Pair("Filho", "Pedro"), Pair("Filho", "Paulo"))

    familiaMap.put("Pet", "Toby")
    familiaMap.put("Pet", "Amora")
    familiaMap.put("Pet", "Agata")

    //familiaMap.forEach( println((it)) )

}