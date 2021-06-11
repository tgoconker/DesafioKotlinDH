import java.util.*

class Matricula(
    var aluno: Aluno,
    var curso: Curso,
    var dataMatricula: Date,
) {
    override fun toString(): String {
        return "Matricula(dataMatricula=$dataMatricula, aluno=$aluno, curso=$curso)"
    }
}