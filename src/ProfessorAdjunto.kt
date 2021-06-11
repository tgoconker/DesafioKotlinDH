class ProfessorAdjunto(
    nomeProfessor: String,
    sobrenomeProfessor: String,
    codProfessor: Int,
    var horasMonitoria: Int,
) : Professor(nomeProfessor, sobrenomeProfessor, codProfessor) {
    override fun toString(): String {
        return "ProfessorAdjunto(horasMonitoria=$horasMonitoria)"
    }
}
