open class Curso(
    val nomeCurso: String,
    val codCurso: Int,
    var qtdMaxAlunos: Int,
    var professorTitular: Professor? = null,
    var professorAdjunto: Professor? = null

){
    val listaAlunoCurso = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (listaAlunoCurso.size >= qtdMaxAlunos) {
            println("O curso $nomeCurso não possui vagas disponiveis")
            return false
        }
        for (alunoDaLista in listaAlunoCurso) {
            if (alunoDaLista.codAluno == aluno.codAluno) {
                println("Aluno ${aluno.nomeAluno} já registrado no curso $nomeCurso")
                return false
            }
        }
        listaAlunoCurso.add(aluno)
        return true
    }

    fun excluirAluno(aluno: Aluno): Boolean {
        if (listaAlunoCurso.contains(aluno)) {
            listaAlunoCurso.remove(aluno)
            println("Aluno ${aluno.nomeAluno} removido com sucesso")
            return true
        } else {
            println("Aluno não cadastrado neste curso ou aluno inexistente")
            return false
        }
    }

    override fun toString(): String {
        return "Curso(nomeCurso='$nomeCurso', codCurso=$codCurso, qtdMaxAlunos=$qtdMaxAlunos, listaAlunoCurso=$listaAlunoCurso)"
    }


}