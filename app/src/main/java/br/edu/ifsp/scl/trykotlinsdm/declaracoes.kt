package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // Variáveis mutáveis - var
    var frase: String = "Hello, world!"

    // Imprimir variable
    println(frase)

    // Imprimindo com String Template - Evita concatenação
    println("$frase")

    println("${frase}")

    // Imprimir com chamada de função
    println("Qtd de chars: ${frase.count()}")

    // Imprimir com propriedade (get)
    println("Qtd de chars: ${frase.length}")

    // Variáveis imutáveis - val (Constante)

}