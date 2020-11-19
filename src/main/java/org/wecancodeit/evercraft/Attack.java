package org.wecancodeit.evercraft;

public class Attack {

    private Hero attacker;
    private Hero defender;

    public Attack(Hero attacker, Hero defender) {

        this.attacker = attacker;
        this.defender = defender;
    }

    public boolean resolve(int roll){

        return roll > defender.getArmorClass();
    }
}
