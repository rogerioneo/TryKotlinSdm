package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    var nome: String
    //nome = null

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome?:"Néo"

//    Erro
//    println(sobrenome.capitalize())
//    println(sobrenome.length)

//    Exibindo valor nulo
//    println(sobrenome?.capitalize())
//    println(sobrenome?.length)

//  Null pointer exception
//    println(sobrenome!!.capitalize())
//    println(sobrenome!!.length)

//    Tratando excessão
//    try{
//        println(sobrenome!!.capitalize())
//        println(sobrenome!!.length)
//    } catch (kne: KotlinNullPointerException){
//
//    }

//    Verificação por if
    if (sobrenome != null) {
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }

}