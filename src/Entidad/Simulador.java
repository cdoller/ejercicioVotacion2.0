package Entidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
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
        
        ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList("Manolo","Nikita","Takeshi","Vladimir","Martha","Aristoteles","Hypatia","Deborah","Kim"));
        ArrayList<String> listaApellidos = new ArrayList<>(Arrays.asList("Putin","Nakamura","Jimenez","Mussolini","Khan","Hotpants","Coldpants","Solis","Zheng"));
        ArrayList<String> nombresAlumnos=new ArrayList<>();
        String nombre="";
        String apellido="";
        
        
        Collections.shuffle((listaNombres));
        Collections.shuffle(listaApellidos);
        
        while(nombresAlumnos.size()<cantidadAlumnos){
            for (String lista : listaNombres) {
            nombre=lista;
            for (String apellidoAlumno : listaApellidos) {
                if(apellido!=apellidoAlumno){
                     apellido=apellidoAlumno;
                }
                nombresAlumnos.add(nombre+" "+apellido);
            }
        }}
        return nombresAlumnos;
    }

    /**
     * Genera un HashSet con dni aleatorios, los cuales deben ser unicos La
     * cantidad de elementos del HashSet debe ser cantidadAlumnos
     *
     * @return
     */
    public HashSet<Dni> generarListaDni() {
        HashSet<Dni> dnis = new HashSet<>();
        Random random = new Random();
        String posiblesTiposDni = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numerosPosiblesDni = 999_999_999;
        int posicionRandomTipo = 0;
        
        String tipoSeleccionado = "";
        int numeroDni = 0;
        
        while(dnis.size() != cantidadAlumnos){
            posicionRandomTipo = random.nextInt(posiblesTiposDni.length());
            tipoSeleccionado = posiblesTiposDni.substring(posicionRandomTipo, posicionRandomTipo+1);
            numeroDni = random.nextInt(numerosPosiblesDni)+1;
            
            dnis.add(new Dni(numeroDni, tipoSeleccionado));
        }
        
        return dnis;
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
