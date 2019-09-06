package br.edu.ifsp.scl.trykotlinsdm

fun main(args: Array<String>) {
    // String explícito
    var nome: String = "Rogério"

    // String implícito
    var sobrenome = "Néo"

    // Inicialização tardia
    var nomeMeio: String // especificação de tipo obrigatória
    nomeMeio = "Franco"

    // Float
    var altura: Float = 1.68f

    // Inteiro
    var idade: Int = 41

    // Casting (tudo em Kotlin é objeto
    var peso: Double = 75.toDouble() // 75.0

    println("Nome: ${nome} $nomeMeio $sobrenome \nAltura: $altura \nIdade: ${idade} \nPeso: ${peso.toInt()}")
}