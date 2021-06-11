open class Curso(
    val nomeCurso: String,
    val codCurso: Int,
    val qtdMaxAlunos: Int,

) {
    val listaAlunoCurso = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (listaAlunoCurso.size >= qtdMaxAlunos) {
            println("Turma cheia")
            return false
        }
        for (alunoDaLista in listaAlunoCurso) {
            if (alunoDaLista.codAluno == aluno.codAluno) {
                println("Aluno já registrado no curso $nomeCurso")
                return false
            }
        }
        listaAlunoCurso.add(aluno)
        println("Aluno matriculado com sucesso no curso $nomeCurso")
        return true
    }

    fun excluirAluno(aluno: Aluno): Boolean {
        for (alunoDaLista in listaAlunoCurso) {
            if (alunoDaLista.codAluno == aluno.codAluno) {
               listaAlunoCurso.remove(aluno)
                return true
            }
        }
        return false

        }

    override fun toString(): String {
        return "Curso(nomeCurso='$nomeCurso', codCurso=$codCurso, qtdMaxAlunos=$qtdMaxAlunos, listaAlunoCurso=$listaAlunoCurso)"
    }


}