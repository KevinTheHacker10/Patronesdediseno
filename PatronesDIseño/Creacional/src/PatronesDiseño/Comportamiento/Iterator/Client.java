
package PatronesDiseño.Comportamiento.Iterator;

/**
 *
 * @author Samir, Kevin y Floryan
 */

public class Client {
	public static void main(String argv[]) {
    	Vector vector = new Vector(5);
    	
    	//Creación del iterador
    	IteratorVector iterador = vector.iterador();
    	
    	//Recorrido con el iterador
    	while (iterador.posteriorPL())
            System.out.println(iterador.posterior());    	    	
    }
}
                ///COMENTARIO FLORYAN///
// En mi caso creo que uno de los patrones que más e utiliado para resolver ciertos ejercicios 
//es el iterator ya que los iteratores son un patrón de diseño de comportamiento que permite
//el recorrido secuencial de estructuras de datos complejas sin exponer sus detalles internos.
//Los elementos de diferentes colecciones se pueden recorrer de manera similar utilizando
//una única interfaz de iterator.