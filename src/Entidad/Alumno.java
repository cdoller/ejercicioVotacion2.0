package Entidad;

public class Alumno {

    private String nombreCompleto;
    private Dni dni;
    private int cantidadVotos;
    private Voto voto;
    private boolean haVotado;

    /**
     * 
     * @param nombreCompleto
     * @param dni 
     */
    public Alumno(String nombreCompleto, Dni dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        cantidadVotos = 0;
        haVotado = false;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Dni getDni() {
        return dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public Voto getVoto() {
        return voto;
    }

    public boolean isHaVotado() {
        return haVotado;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }

    public void setHaVotado(boolean haVotado) {
        this.haVotado = haVotado;
    }

    /**
     * Suma un voto a cantidad de votos
     */
    public void sumarVoto() {

    }

}
