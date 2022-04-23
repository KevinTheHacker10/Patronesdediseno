package PatronesDiseño.Estructural.Proxy;

/**
 *
 * @author Samir, Kevin y Floryan
 */
public class ClientImage  {

    public static void main(String[] args) {

        Imagen image = new ProxyImage("img_10.jpg");

        //la imagen se cargará desde el disco
        image.ecenario();
        System.out.println("");

        //la imagen no se cargará desde el disco
        image.ecenario();
    }
/**
 * COMENARIO DE SAMIR LÓPEZ
 * 
 * El patron de diseño Proxy lo e implementado en pocas ocaciones pero es muy
 * util para hacer una referecia a un objeto más sofisicado que un puntero, es
 * decir que su función principal es sustituir al objeto de origen para poder
 * tener control de sus funciones, por ejemplo al programar una relación de un 
 * cliente con el banco. La tarjeta de crédito funciona como un proxy, por el
 * cliente no tiene necesidad de llevar efectivo, y el banco solo resive las
 * transacciones de forma electónica, todo sin riesgo.
 */
    
}