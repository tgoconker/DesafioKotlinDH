class DigitalHouseManager {
    var listaAluno: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(curso: Curso) {
        if (listaCursos.contains(curso)) {
            println("Curso já registrado")
        } else {
            listaCursos.add(curso)
            println("Curso registrado com sucesso")
        }
    }

    fun excluirCurso(curso: Curso) {
        for (cursoParaRemover in listaCursos) {
            if (cursoParaRemover.codCurso == curso.codCurso) {
                listaCursos.remove(curso)
                println("Curso removido com sucesso")
            } else {
                println("Curso inexistente")
            }
        }
    }


    fun registrarProfAdjunto(professorAdjunto: ProfessorAdjunto) {
        if (listaProfessores.contains(professorAdjunto)) {
            println("Professor adjunto já registrado")
        } else {
            listaProfessores.add(professorAdjunto)
            println("Professor adjunto registrado com sucesso")

        }
    }

    fun registrarProfTitular(professorTitular: ProfessorTitular) {
        if (listaProfessores.contains(professorTitular)) {
            println("Professor titular já registrado")
        } else {
            listaProfessores.add(professorTitular)
            println("Professor titular registrado com sucesso")
        }
    }

    fun excluirProfessor(professor: Professor) {
        if (listaProfessores.contains(professor)) {
            listaProfessores.remove(professor)
            println("Professor excluido com sucesso")
        } else {
            println("Professor não encontrado")
        }
    }

    fun matricularAluno(aluno: Aluno) {
        for (alunoDaLista in listaAluno) {
            if (alunoDaLista.codAluno == aluno.codAluno) {
                println("Aluno já registrado")
                return
            }
        }
        listaAluno.add(aluno)
        println("Aluno matriculado com sucesso")
    }


    fun matricularAlunoEmCurso(codigoAluno:Int, codigoCurso:Int) {
        print(listaAluno.get(codigoAluno-1))
//
//        if (codigoAluno in listaAluno.indices){
//            println()
//        }
//
        if (codigoAluno in listaAluno.indices && codigoCurso in listaCursos.indices){

            listaMatriculas.add(codigoAluno,codigoCurso)
        }

    }

    fun imprimirListaALuno() {
        println(listaAluno)
    }

    fun imprimirListaCurso() {
        println(listaCursos)
    }

    fun imprimirListaProfessores() {
        println(listaProfessores)
    }

    fun imprimirListaMatriculas() {
        println(listaMatriculas)
    }
}