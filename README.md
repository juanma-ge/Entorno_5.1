# Entorno_5.1

# Ejercicio 5.1

## 1. Interpreta el significado del diagrama de clases.

### a) Relación entre las clases. Significado, tipo, multiplicidad.
- La relación entre `Estudiante` y `Curso` es una relación de agregación, donde `Estudiante` es parte de `Curso`, pero también puede ser independiente.
- Un `Curso` puede tener de cero a muchos alumnos.
- Un `Estudiante` solo puede estar inscrito en un único curso.

### b) Elementos de las clases. Tipos y propósito.
- **Curso** se compone de tres atributos y dos métodos:
  - **Atributos:**
    - `Nombre` (String)
    - `Código` (String)
    - `Estudiantes` (Lista mutable)
  - **Métodos:**
    - `AgregarAlumno(Estudiante estudiante)`: Agrega un alumno a la lista.
    - `mostrarEstudiantes()`: Muestra la lista de estudiantes al usuario.

- **Estudiante** se compone de dos atributos y un método:
  - **Atributos:**
    - `Nombre` (String)
    - `DNI` (String)
  - **Método:**
    - `inscribirse(Curso curso)`: Permite inscribirse en un curso.

### c) Significado del método `agregarAlumno()`. Funcionamiento.
- Añade cada alumno a una lista de alumnos.
- Se pasa un elemento `Estudiante` como parámetro, el cual se añade a la lista de estudiantes.

### d) Significado del método `inscribirse()`
- Cuando se llama al método `inscribirse()`, permite al usuario inscribirse en un curso.
