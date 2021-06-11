fun main() {

    val aluno00 = Aluno("Thiago", "Mendes", 1)
    val aluno01 = Aluno("João", "Cleber", 2)
    val aluno02 = Aluno("Away", "de Petropolis", 3)
    val aluno03 = Aluno("Luiz", "Boça", 4)
    val aluno04 = Aluno("Manteiro", "Lobato", 5)


    val professorTitular00 = ProfessorTitular("Laisier", "Martins", 111,"Choque")
    val professorTitular01 = ProfessorTitular("Carlos", "Alberto", 112, "Ler Jornal")
    val professorAdjunto00 = ProfessorAdjunto("Galvão", "Bueno", 113,10)
    val professorAdjunto01 = ProfessorAdjunto("Cleber", "Machado", 114,15)
    val curso00 = Curso("Full Stack", 20001, 3)
    val curso01 = Curso("Android", 20002, 2)

    val digitalHouseManager = DigitalHouseManager()


//    digitalHouseManager.registrarProfTitular(professorTitular00)
//    digitalHouseManager.registrarProfTitular(professorTitular01)
//
//    digitalHouseManager.registrarProfAdjunto(professorAdjunto00)
//    digitalHouseManager.registrarProfAdjunto(professorAdjunto01)

//  digitalHouseManager.registrarCurso(curso00)
//  digitalHouseManager.registrarCurso(curso01)


//    digitalHouseManager.alocarProfessores(curso00, professorTitular00, professorAdjunto00)
//    digitalHouseManager.alocarProfessores(curso01, professorTitular01, professorAdjunto01)

    digitalHouseManager.matricularAluno(aluno00)
    digitalHouseManager.matricularAluno(aluno01)
    digitalHouseManager.matricularAluno(aluno02)
    digitalHouseManager.matricularAluno(aluno03)
    digitalHouseManager.matricularAluno(aluno04)

digitalHouseManager.matricularAlunoEmCurso(1,20001)
}
