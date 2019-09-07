package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {

    //Exibir somente os cursos com a palavra "Sistemas"

    val listaCursos: MutableList<String> = mutableListOf("Análise e Desenvolvimento de Sistemas",
            "Sistemas para Disposistivos Móveis")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    //Solução tradicional implementada por mim

//    for (i in 0..listaCursos.size-1){
//        if (listaCursos[i].contains("Sistemas"))
//            println("$i ${listaCursos[i]}")
//    }

//    listaCursos.forEach { lista -> (
//                if (lista.contains("Sistemas"))
//                    println(lista)
//            )}
//
//    }


    //Solução implementada pelo professor
    //Solução 1

//    val listaCursosSistemas = mutableListOf<String>()
//    for (curso  in listaCursos) {
//        if (curso.contains("Sistemas"))
//            listaCursosSistemas.add(curso)
//    }

//    for (i in 0..listaCursosSistemas.size-1)
//        println("$i - ${listaCursosSistemas[i]}")

    //Solução 2

    val listaCursosSistemas = listaCursos.filter { it.contains("Sistemas") }
//    listaCursosSistemas.withIndex().forEach { println("${it.index} - ${it.value}") }

    //Solução 3

//    listaCursosSistemas.withIndex().forEach(::imprime)

    //Solução 4

    val imp = fun (i: IndexedValue<String>) {
        println("${i.index} - ${i.value}")
    }

    listaCursosSistemas.withIndex().forEach(imp)
}

fun imprime(i: IndexedValue<String>) {
    println("${i.index} - ${i.value}")
}