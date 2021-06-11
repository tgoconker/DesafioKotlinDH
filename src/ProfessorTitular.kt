class ProfessorTitular(
    nomeProfessor: String,
    sobrenomeProfessor: String,
    codProfessor: Int,
    var especialidade: String,
) : Professor(nomeProfessor, sobrenomeProfessor, codProfessor) {
    override fun toString(): String {
        return "ProfessorTitular(especialidade='$especialidade')"
    }
}