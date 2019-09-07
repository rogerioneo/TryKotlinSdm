package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {

    //Dado o Map abaixo, imprima o seu conteúdo

    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Rogério"),
            Pair("Mãe", "Danielli"), Pair("Filho", "Pedro"), Pair("Filho", "Paulo"))

    familiaMap.put("Pet", "Toby")
    familiaMap.put("Pet", "Amora")
    familiaMap.put("Pet", "Agata")

    for (familia in familiaMap){
        println("${familia.toPair().first}: ${familia.toPair().second}")
    }
}