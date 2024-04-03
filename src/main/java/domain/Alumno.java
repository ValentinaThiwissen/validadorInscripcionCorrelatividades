package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String legajo;
    private List <Materia> materiasAprobadas;

    public Alumno(String legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Boolean cumpleCorrelativas(Materia materia){
        if (materia.getCorrelativas().isEmpty()){
            return true;}
        else {
            return materiasAprobadas.containsAll(materia.getCorrelativas());
        }
    }

    public void agregarMateriasAprobadas(Materia materia){
        this.materiasAprobadas.add(materia);
    }

}
