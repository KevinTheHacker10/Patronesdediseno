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
public enum Armadura {

    Ropas("Ropas"), Cueros("Cuero"), Cotademalla("Cota de malla"),
    armaduradeplacas("Armadura de placas y mallas");

    private String Titulo;

    Armadura(String titulo) {
        this.Titulo = titulo;
    }

    @Override
    public String toString() {
        return Titulo;
    }

}
