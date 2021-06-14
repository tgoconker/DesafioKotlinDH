fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfTitular("Laisier", "Martins", 111,"Choque")
    digitalHouseManager.registrarProfTitular("Carlos", "Alberto", 112, "Ler Jornal")

    digitalHouseManager.registrarProfAdjunto("Galvão", "Bueno",211,10)
    digitalHouseManager.registrarProfAdjunto("Cleber", "Machado", 212,15)

    digitalHouseManager.registrarCurso("full Stack",20001,3)
    digitalHouseManager.registrarCurso("Android",20002,2)

    digitalHouseManager.alocarProfessores(20001,111,212)
    digitalHouseManager.alocarProfessores(20002,112,211)

    digitalHouseManager.matricularAluno("Thiago", "Mendes", 1)
    digitalHouseManager.matricularAluno("João", "Cleber", 2)
    digitalHouseManager.matricularAluno("Away", "de Petropolis", 3)
    digitalHouseManager.matricularAluno("Luiz", "Boça", 4)
    digitalHouseManager.matricularAluno("Monteiro", "Lobato", 5)

    digitalHouseManager.matricularAlunoEmCurso(1,20001)
    digitalHouseManager.matricularAlunoEmCurso(2,20001)
    digitalHouseManager.matricularAlunoEmCurso(3,20002)
    digitalHouseManager.matricularAlunoEmCurso(4,20002)
    digitalHouseManager.matricularAlunoEmCurso(5,20002)

}
