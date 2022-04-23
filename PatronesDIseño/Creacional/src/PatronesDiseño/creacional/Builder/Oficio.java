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
public enum Oficio {

    GUERRERO, LADRÓN, MAGO, SACERDOTE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }


}