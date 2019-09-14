package br.edu.ifsp.scl.trykotlinsdm

fun processaTexto(str1: String, str2: String, processa: (String, String) -> String) = processa(str1, str2)

//concatena texto
fun concatena(a: String, b: String): String {
    return "${a}${b}" //"${a + b}
}

//Inverte texto
fun inverte(a: String, b: String) = "${a.reversed() + b.reversed()}"

fun List<String>.paraCadaString(funcao: (String) -> String):List<String> {
    val listaStrings: MutableList<String> = mutableListOf()

//    for (s in this) {
//        listaStrings.add(funcao(s))
//    }
    this.forEach { listaStrings.add(funcao(it)) }

    return listaStrings.toList()
}

fun primeiraLetra(str: String): String = str.first().toString()

//Função com uma lista abstrata
fun <P> List<P>.paraCada(funcao: (P) -> P): List<P> {
    val retornoList: MutableList<P> = mutableListOf()

    this.forEach { retornoList.add(funcao(it)) }

    return retornoList
}
//inline - Copia o que conteudo para quem está chamando
inline fun incrementa(i: Int) = i + 1
fun dobra(f: Float) = 2 * f

fun main() {
    val listaNomes = listOf("Rogério", "Dani", "Pedro", "Paulo")

    //val listaPrimeiraLetra = listaNomes.paraCadaString(::primeiraLetra)
    //val listaPrimeiraLetra = listaNomes.paraCadaString{ primeiraLetra(it) }
    val listaPrimeiraLetra = listaNomes.paraCadaString { it.first().toString() }

    listaPrimeiraLetra.forEach { println(it) }


    val listaInteiros: List<Int> = (1..10).toList()
    val listaIncrementados: List<Int> = listaInteiros.paraCada(::incrementa)
    listaIncrementados.forEach { println(it) }

    val listaFloats: List<Float> = listOf(1f, 2f, 2.5f, 4f)
    val listaDobrados: List<Float> = listaFloats.paraCada { x -> dobra(x) }
    listaDobrados.forEach { println(it) }
}
/*
fun main() {
    println(processaTexto("olá, ", "mundo", ::concatena))
    println(processaTexto("olá, ", "mundo", ::inverte))

    println(processaTexto("olá, ", "mundo", {a, b -> inverte(a, b)}))
    println(processaTexto("Olá, ", "mundo")
        {a, b -> concatena(a, b) }
    )
    println(processaTexto("Olá, ", "mundo") {a, b -> "${a.reversed() + b.reversed()}" }

}
*/