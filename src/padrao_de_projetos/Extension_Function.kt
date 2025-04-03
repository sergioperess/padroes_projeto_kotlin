package padrao_de_projetos

fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val t = slugTitulo.let {n -> n.toLowerCase()}
    val slugAutor = autor.generateSlug()
    val a = slugAutor.let {n -> n.toLowerCase()}

    println("Slug gerado para o livro:")

    println("${t}_$a")
}

fun String.generateSlug(): String {
    return this.replace(". ","-").replace(" ", "-")
}