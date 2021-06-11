open class Aluno(
    var nomeAluno: String,
    var sobrenomeAluno: String,
    var codAluno: Int
) {
    override fun toString(): String {
        return "Aluno(nomeAluno='$nomeAluno', sobrenomeAluno='$sobrenomeAluno', codAluno=$codAluno)"
    }

}