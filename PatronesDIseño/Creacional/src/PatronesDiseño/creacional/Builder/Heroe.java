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
public class Heroe {

    private String nombre;
    private Oficio profession;
    private Armadura Armadura;
    private Arma Arma;

    public Heroe(){

    }

    public void setName(String Nombre) {
        this.nombre = Nombre;
    }

    public void setProfession(Oficio Oficio) {
        this.profession = Oficio;
    }

    public void setArmadura(Armadura Armaduras) {
        this.Armadura = Armaduras;
    }

    public void setArma(Arma Armas) {
        this.Arma = Armas;
    }

    public Oficio getOficio() {
        return profession;
    }

    public String getNombre() {
        return nombre;
    }

    public Armadura getArmadura() {
        return Armadura;
    }

    public Arma getarma() {
        return Arma;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Este es un ");
        sb.append(profession);
        sb.append(" llamado ");
        sb.append(nombre);

        if (Armadura != null) {
            sb.append(" que viste de ");
            sb.append(Armadura);
        }
        if (Arma != null) {
            sb.append(" y utiliza una ");
            sb.append(Arma);
        }

        sb.append(" en la batalla final.");
        return sb.toString();
    }

}