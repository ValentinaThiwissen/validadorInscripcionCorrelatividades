package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativas(Materia materia){
        this.correlativas.add(materia);
    }
}

