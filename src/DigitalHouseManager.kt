import java.util.*


class DigitalHouseManager {
    var listaAluno: MutableList<Aluno> = mutableListOf()
    var listaProfessores: MutableList<Professor> = mutableListOf()
    var listaCursos: MutableList<Curso> = mutableListOf()
    var listaMatriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nomeCurso: String, codCurso: Int, qtdMaxAlunos: Int) {
        val curso = Curso(nomeCurso = nomeCurso, codCurso = codCurso, qtdMaxAlunos = qtdMaxAlunos)
        if (listaCursos.find { it.codCurso == codCurso } == null) {
            listaCursos.add(curso)
            println("Curso $nomeCurso registrado com sucesso")
        } else {
            println("Curso $nomeCurso já registrado")
        }
    }

    fun excluirCurso(codCurso: Int) {
        val curso = listaCursos.find { it.codCurso == codCurso }
        if (curso == null) {
            println("Curso não encontrado")
        } else {
            listaCursos.remove(curso)
            println("curso ${curso.nomeCurso} excluido com sucesso ")
        }
    }


    fun registrarProfAdjunto(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Int,
        horasMonitoria: Int
    ) {
        val professor = ProfessorAdjunto(
            nomeProfessor = nomeProfessor,
            sobrenomeProfessor = sobrenomeProfessor,
            codProfessor = codigoProfessor,
            horasMonitoria = horasMonitoria
        )
        if (listaProfessores.find { it.codProfessor == codigoProfessor } == null) {
            listaProfessores.add(professor)
            println("Professor adjunto $nomeProfessor registrado com sucesso")
        } else {
            println("Professor adjunto $nomeProfessor já registrado")
        }
    }

    fun registrarProfTitular(
    nomeProfessor: String,
    sobrenomeProfessor: String,
    codigoProfessor: Int,
    especialidade: String
    ) {
        val professor = ProfessorTitular(
            nomeProfessor = nomeProfessor,
            sobrenomeProfessor = sobrenomeProfessor,
            codProfessor = codigoProfessor,
            especialidade = especialidade)
        if (listaProfessores.find { it.codProfessor == codigoProfessor } == null) {
            listaProfessores.add(professor)
            println("Professor titular $nomeProfessor registrado com sucesso")
        } else {
            println("Professor titular $nomeProfessor já registrado")
        }
    }

    fun excluirProfessor(codigoProfessor: Int){
        val professor = listaProfessores.find { it.codProfessor == codigoProfessor }
        if (professor == null){
            println("Professor não encontrado")
        } else {
            listaProfessores.remove(professor)
            println("Professor ${professor.nomeProfessor} excluido com sucesso")
        }
    }

    fun matricularAluno(
        nomeAluno: String,
        sobrenomeAluno: String,
        codigoAluno: Int
    ){
        val aluno = Aluno(nomeAluno = nomeAluno,
            sobrenomeAluno = sobrenomeAluno,
            codAluno = codigoAluno)
        if (listaAluno.find { it.codAluno == codigoAluno } == null) {
            listaAluno.add(aluno)
            println("Aluno ${aluno.nomeAluno} matriculado com sucesso")
            } else {
            println("Aluno ${aluno.nomeAluno} já registrado")
        }

    }

    fun matricularAlunoEmCurso(
        codigoAluno: Int,
        codigoCurso: Int
    ) {
        val aluno = listaAluno.find { it.codAluno == codigoAluno }
        val curso = listaCursos.find { it.codCurso == codigoCurso }
        val data = Calendar.getInstance().time


        if (aluno == null) {
            println("Aluno inexistente")
        } else if (curso == null) {
            println("Curso inexistente")
        } else {
            if (curso.adicionarAluno(aluno)) {
                listaMatriculas.add(Matricula(aluno, curso, data))
                println("Aluno ${aluno.nomeAluno} cadastrado com sucesso no curso ${curso.nomeCurso}.")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val curso = listaCursos.find { it.codCurso == codigoCurso }
        val professorTitular = listaProfessores.find { it.codProfessor == codigoProfessorTitular }
        val professorAdjunto = listaProfessores.find { it.codProfessor == codigoProfessorAdjunto }
        when {
            curso == null -> {
                println("Curso inexistente")
            }
            professorTitular == null -> {
                println("Professor titular inexistente")
            }
            professorAdjunto == null -> {
                println("Professor adjunto inexistente")
            }
            else -> {
                listaCursos.forEach {
                    if (it.codCurso == codigoCurso) {
                        it.professorTitular = professorTitular
                        println("Professor titular ${professorTitular.nomeProfessor} alocado com sucesso no curso ${curso.nomeCurso}")
                        it.professorAdjunto = professorAdjunto
                        println("Professor adjunto ${professorAdjunto.nomeProfessor} alocado com sucesso no curso ${curso.nomeCurso}")
                    }
                }
            }
        }
    }
}