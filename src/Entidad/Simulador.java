package Entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Simulador {

    private int cantidadAlumnos;

    public Simulador(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    /**
     * Genera una lista aleatoria de nombres de longitud cantidadAlumnos
     *
     * @return
     */
    public ArrayList<String> generarListaNombres() {

    }

    /**
     * Genera un HashSet con dni aleatorios, los cuales deben ser unicos La
     * cantidad de elementos del HashSet debe ser cantidadAlumnos
     *
     * @return
     */
    public HashSet<Dni> generarListaDni() {

    }

    /**
     * Genera cantidadAlumnos de Alumnos
     *
     * @param nombres
     * @param dnis
     * @return
     */
    public ArrayList<Alumno> generarAlumnos(ArrayList<String> nombres, HashSet<Dni> dnis) {

    }

    /**
     * Devuelve el listado completo de los alumnos
     *
     */
    public void imprimirAlumnos(ArrayList<Alumno> alumnos) {

    }

    /**
     * Recibe el listado de alumnos y para cada alumno genera tres votos de
     * manera aleatoria. debemos guardar a los alumnos a los que votó y sumarle
     * uno a la cantidad de votos a cada alumno que reciba un voto Tener en
     * cuenta que un alumno no puede votarse a sí mismo o votar más de una vez
     * al mismo alumno.
     *
     * @param voto
     * @param alumnos
     * @return
     */
    public ArrayList<Alumno> votacion(Voto voto, ArrayList<Alumno> alumnos) {

    }

    /**
     * Se debe crear un método que muestre a cada Alumno con su cantidad de
     * votos y cuales fueron sus 3 votos.
     *
     */
    public void mostrarDetalleVotacion(ArrayList<Alumno> alumnos) {

    }

    /**
     * Se debe crear un método que haga el recuento de votos, este recibe la
     * lista de Alumnos y comienza a hacer el recuento de votos.
     *
     * @param alumnos
     * @return
     */
    public TreeSet<Alumno> recuentoVotos(ArrayList<Alumno> alumnos) {

    }
}
