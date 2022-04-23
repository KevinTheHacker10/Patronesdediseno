/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesDiseño.Creacional.Builder;

/**
 *
 * @author Samir, Kevin y Floryan
 */

public class Labatallafinal {

    public static void main(String[] args) {
        Heroe mago = new CreadordeHeroes(Oficio.MAGO, "Merlin")
                .withWeapon(Arma.DAGA)
                .build();
        System.out.println(mago);

        Heroe Guerrero = new CreadordeHeroes(Oficio.GUERRERO, "Perseo")
                .withArmor(Armadura.Cotademalla)
                .withWeapon(Arma.ESPADA).build();
        System.out.println(Guerrero);

        Heroe ladron = new CreadordeHeroes(Oficio.LADRÓN, "Robin Hood")
                .withWeapon(Arma.ARCO).build();
        System.out.println(ladron);
        
    }

}
//COMENTARIO KEVIN MURILLO 
/*Considero que el metodo creacional que mas reconozco que he utilizado ha sido
el creacional con la particularidad de que las variables que utilizo son de tipo
builder es por eso que he utilizado de ejemplo este programa para demostrarlo.
Ademas que es una forma muy sencilla y simple de crear codigos optimizables.

*/