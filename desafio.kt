// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val usuario: String, val email: String)

data class ConteudoEducacional(
    val nome: String,
    val descricao: String,
    val duracao: Int = 60
)

data class Formacao(val nome: String) {
    private val conteudos = mutableListOf<ConteudoEducacional>()
    private val inscritos = mutableListOf<Usuario>()

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }

    fun removerConteudo(conteudo: ConteudoEducacional) {
        conteudos.remove(conteudo)
    }

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun iniciarFormacao() {
        // Lógica para iniciar a formação
    }
}

fun main() {
    // Criando alguns objetos
    val usuario1 = Usuario("Alice", "alice@email.com")
    val usuario2 = Usuario("Bob", "bob@email.com")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", "Fundamentos do Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", "POO com Kotlin", 90)

    val formacao = Formacao("Desenvolvimento Kotlin")
    formacao.adicionarConteudo(conteudo1)
    formacao.adicionarConteudo(conteudo2)
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Imprimindo informações
    println("Formação: ${formacao.nome}")
    println("Conteúdos: ${formacao.conteudos}")
    println("Inscritos: ${formacao.inscritos}")

    // Iniciar a formação
    formacao.iniciarFormacao()
}
