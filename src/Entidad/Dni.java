package Entidad;

public class Dni {

    private int numero;
    private String tipo;

    public Dni(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dni other = (Dni) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

}
