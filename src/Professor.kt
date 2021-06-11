open class Professor(
    var nomeProfessor: String,
    var sobrenomeProfessor: String,
    var codProfessor: Int,
    var tempoCasa: Int = 0
) {
    override fun toString(): String {
        return "Professor(nomeProfessor='$nomeProfessor', sobrenomeProfessor='$sobrenomeProfessor', codProfessor=$codProfessor, tempoCasa=$tempoCasa)"
    }
}