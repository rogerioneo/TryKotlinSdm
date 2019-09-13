package br.edu.ifsp.scl.trykotlinsdm

// Função simples
//fun multiplo(a: Int = 10, b: Int):Boolean {
//    val c: Int = a % b
//    if (c == 0) {
//        return true
//    }
//    return false
//}

//Função single expression
fun multiplo(a: Int = 10, b: Int) = a % b == 0

//if-else como ternário
fun multiple(a: Int = 10, b: Int) = if (a % b == 0) true else false

//Função extendida
fun Int.multiploo(b: Int):Boolean {
    return multiplo(this, b)
}

infix fun Int.multiplooo(b: Int):Boolean {
    return multiplo(this, b)
}

fun main() {
    println(multiplo(10, 2))
    println(10.multiploo(3))
    println(10.multiploo(4))
    println(10 multiplooo 5)

    //Chamada para valor padrão quando o padrão está em primeiro
    println(multiple(b=2))
}