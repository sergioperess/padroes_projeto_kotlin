// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario(val string: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel = Nivel.BASICO) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1: Usuario = Usuario("João")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Lucas")

    val conteudos = mutableListOf<ConteudoEducacional>()
    val conteudo1 = ConteudoEducacional("Noções básicas de Kotlin", 20)
    val conteudo2 = ConteudoEducacional("Primeiros passod com Kotlin", 45)
    val conteudo3 = ConteudoEducacional("POO com Kotlin", 33)
    val conteudo4 = ConteudoEducacional("Backend utilizando Spring framework e Kotlin", 100)

    conteudos.add(conteudo1)
    conteudos.add(conteudo2)
    conteudos.add(conteudo3)
    conteudos.add(conteudo4)

    val formacao = Formacao("Bootcamp de Kotlin", conteudos, Nivel.AVANÇADO)
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    print("Incritos: \n")
    for(i in formacao.inscritos){
        println("${i.string}")
    }

    println("\nFormação: ${formacao.nome} - Nivel: ${formacao.nivel}")

    for(conteudo in formacao.conteudos){
        println("Conteudo: ${conteudo.nome} - Tempo de curso: ${conteudo.duracao} horas")
    }


}