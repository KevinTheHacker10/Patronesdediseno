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
public class CreadordeHeroes {

    private Heroe hero;

    public CreadordeHeroes(Oficio profession, String name) {
        this.hero = new Heroe();
        if (profession == null || name == null) {
            throw new IllegalArgumentException(
                    "profession and name can not be null");
        }
        hero.setProfession(profession);
        hero.setName(name);
    }

    public CreadordeHeroes withArmor(Armadura armor) {
        hero.setArmadura(armor);
        return this;
    }

    public CreadordeHeroes withWeapon(Arma weapon) {
        hero.setArma(weapon);
        return this;
    }

    public Heroe build() {
        return hero;
    }


}
