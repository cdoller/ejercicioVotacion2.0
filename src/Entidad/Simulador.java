package Entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Simulador {
    Random random = new Random();
    Scanner leer = new Scanner(System.in);
    

    private int cantidadAlumnos;

    public Simulador(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public int getCantidadAlumnos() {
        System.out.println("Cuantos alumnos conforman el grupo?");
        int cantidadAlumnos = leer.nextInt();
        leer.nextLine();
        return cantidadAlumnos;
    }

    /**
     * Genera una lista aleatoria de nombres de longitud cantidadAlumnos
     *
     * @return
     */
    public ArrayList<String> generarListaNombres(int num) {
        ArrayList listaNombres = new ArrayList();
        String[] nombre = new String[20];
        String[] apellido = new String [20];
        
        nombre[0]="Lorena";
        nombre[1]="Malu";
        nombre[2]="Juan";
        nombre[3]="Andrés";
        nombre[4]="Pepe";
        nombre[5]="Ana";
        nombre[6]="Natalia";
        nombre[7]="Abril";
        nombre[8]="Carlos";
        nombre[9]="Franco";
        nombre[10]="Pablo";
        nombre[11]="Edna";
        nombre[12]="Lucia";
        nombre[13]="Edgar";
        nombre[14]="Samuel";
        nombre[15]="Cata";
        nombre[16]="Juanes";
        nombre[17]="Santiago";
        nombre[18]="Laura";
        nombre[19]="Camila";
        
        
        apellido[0]="Leguizamón";
        apellido[1]="Cruz";
        apellido[2]="Rodriguez";
        apellido[3]="Castillo";
        apellido[4]="Caicedo";
        apellido[5]="Londoño";
        apellido[6]="González";
        apellido[7]="Franco";
        apellido[8]="Arcila";
        apellido[9]="Quiroga";
        apellido[10]="García";
        apellido[11]="Blanco";
        apellido[12]="Cordero";
        apellido[13]="Sierra";
        apellido[14]="Forero";
        apellido[15]="Fernandez";
        apellido[16]="Cano";
        apellido[17]="Oller";
        apellido[18]="Barbieri";
        apellido[19]="Gutierrez";
        
        while(num!=0){
            int min = 0;
            int max = apellido.length-1;

        
            int ranNom=random.nextInt(max-min+1)+min;
            String nombreAlumno=nombre[ranNom];
         
            int ranApe = random.nextInt(max-min+1)+min;
            String apellidoAlumno=apellido[ranApe];
        
            String nombreCompleto = nombreAlumno+" "+apellidoAlumno;
            
            listaNombres.add(nombreCompleto);
            num--;
        }
        
        return listaNombres;
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
