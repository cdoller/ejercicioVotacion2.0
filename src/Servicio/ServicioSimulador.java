package Servicio;

import Entidad.Alumno;
import Entidad.Simulador;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.TreeSet;

public class ServicioSimulador {

    private ArrayList<Alumno> alumnos;
    private ArrayList<Voto> votos;
    private ArrayList<Alumno> facilitadoresTitulares;
    private ArrayList<Alumno> facilitadoresSuplentes;
    private Simulador simulacion;

    public ServicioSimulador() {
        alumnos = new ArrayList<>();
        votos = new ArrayList<>();
        facilitadoresTitulares = new ArrayList<>();
        facilitadoresSuplentes = new ArrayList<>();
    }

    public void crearSimulacion(int cantidadAlumnos) {
        simulacion = new Simulador(cantidadAlumnos);
    }

    /**
     * Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se
     * deben crear 5 facilitadores suplentes con los 5 segundos alumnos más
     * votados. A continuación, mostrar los 5 facilitadores y los 5
     * facilitadores suplentes.
     *
     * @param facilitadores
     */
    public void setearFacilitadores(TreeSet<Alumno> facilitadores) {

    }

}
