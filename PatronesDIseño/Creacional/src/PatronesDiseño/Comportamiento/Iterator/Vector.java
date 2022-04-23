
package PatronesDiseño.Comportamiento.Iterator;

/**
 *
 * @author Samir, Kevin y Floryan
 */

    public class Vector {
	public int[] datos;

    public Vector(int valores){ 
        datos = new int[valores];
        for (int i = 0; i < datos.length; i++){
            datos[i] = i; 
        }
    }    
    
    public int obtValor(int pos){ 
        return datos[pos]; 
    }

    public void asigValor(int pos, int valor){ 
        datos[pos] = valor; 
    }

    public int dimen(){ 
        return datos.length; 
    }
    
    public IteratorVector iterador(){
        return new IteratorVector(this); 
    }
}
    

