package domain;

import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;
import org.junit.Assert;
import org.junit.Test;

public class testCorrelatividades {
    @Test

    public void apruebaSinCorrelatividades (){
        Alumno valentina = new Alumno("1234");
        Materia analisisMatematico = new Materia("analisis matematico");
        Inscripcion unaInscripcion = new Inscripcion(valentina);

        unaInscripcion.agregarMateriaAInscribirse(analisisMatematico);

        Assert.assertTrue(unaInscripcion.aprobada());
    }
    @Test
    public void apruebaConUnaCorrelatividad (){
        Alumno valentina = new Alumno("1234");
        Materia analisisMatematico = new Materia("analisis matematico");
        Materia probabilidadYEstadistica = new Materia("probabilidad y estadistica");
        Inscripcion unaInscripcion = new Inscripcion(valentina);

        valentina.agregarMateriasAprobadas(analisisMatematico);
        probabilidadYEstadistica.agregarCorrelativas(analisisMatematico);
        unaInscripcion.agregarMateriaAInscribirse(analisisMatematico);

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void apruebaConCorrelatividades (){
        Alumno valentina = new Alumno("1234");
        Materia analisisMatematico = new Materia("analisis matematico");
        Materia algebra = new Materia("algebra y geometria analitica");
        Materia probabilidadYEstadistica = new Materia("probabilidad y estadistica");
        Materia fisica = new Materia("fisica");
        Inscripcion unaInscripcion = new Inscripcion(valentina);

        valentina.agregarMateriasAprobadas(analisisMatematico);
        valentina.agregarMateriasAprobadas(fisica);

        algebra.agregarCorrelativas(analisisMatematico);
        algebra.agregarCorrelativas(fisica);

        unaInscripcion.agregarMateriaAInscribirse(algebra);

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void noApruebaPorCorrelatividades (){
        Alumno valentina = new Alumno("1234");
        Materia analisisMatematico = new Materia("analisis matematico");
        Materia algebra = new Materia("algebra y geometria analitica");
        Materia probabilidadYEstadistica = new Materia("probabilidad y estadistica");
        Materia fisica = new Materia("fisica");
        Inscripcion unaInscripcion = new Inscripcion(valentina);

        valentina.agregarMateriasAprobadas(analisisMatematico);
        valentina.agregarMateriasAprobadas(probabilidadYEstadistica);

        algebra.agregarCorrelativas(probabilidadYEstadistica);
        algebra.agregarCorrelativas(fisica);

        unaInscripcion.agregarMateriaAInscribirse(algebra);

        Assert.assertFalse(unaInscripcion.aprobada());
    }

}