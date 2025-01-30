class Estudiante(val nombre: String, val dni: String) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
        println("\$nombre se ha inscrito en el curso \${curso.nombre}")
    }
}

class Curso(val nombre: String, val codigo: String) {
    private val estudiantes = mutableListOf<Estudiante>()

    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            println("No hay estudiantes inscritos en el curso \$nombre.")
        } else {
            println("Estudiantes en el curso \$nombre:")
            estudiantes.forEach { println("- \${it.nombre} (\${it.dni})") }
        }
    }
}

fun main() {
    val curso1 = Curso("Programación en Kotlin", "KOT101")
    val estudiante1 = Estudiante("Juan Pérez", "12345678")
    val estudiante2 = Estudiante("María López", "87654321")

    estudiante1.inscribirse(curso1)
    estudiante2.inscribirse(curso1)

    curso1.mostrarEstudiantes()
}
