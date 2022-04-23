package PatronesDiseño.Comportamiento.Iterator;

/**
 *
 * @author Samir, Kevin y Floryan
 */
public class IteratorVector {

    private int[] vector;
    private int posicion;

    public IteratorVector(Vector vector) {
        this.vector = vector.datos;
        posicion = 0;
    }

    public boolean posteriorPL() {
        if (posicion < vector.length) {
            return true;
        } else {
            return false;
        }
    }

    public Object posterior() {
        int valor = vector[posicion];
        posicion++;
        return valor;
    }
}
