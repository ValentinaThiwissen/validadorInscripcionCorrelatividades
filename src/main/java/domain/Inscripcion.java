package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();}

    public Boolean aprobada(){
        return this.materias.stream().allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }

    public void agregarMateriaAInscribirse(Materia materia){
        this.materias.add(materia);
    }


}