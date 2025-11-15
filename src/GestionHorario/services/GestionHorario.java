package GestionHorario.services;

import java.util.ArrayList;
import java.util.List;

import GestionHorario.domain.Estudiante;
import GestionHorario.domain.Materia;

public class GestionHorario {
    private List<Materia> materias;
    private List<Estudiante> estudiantes;

    public GestionHorario() {
        materias = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materias.add(materia);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}