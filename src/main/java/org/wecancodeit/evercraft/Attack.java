package org.wecancodeit.evercraft;

public class Attack {
    public Attack(Hero attacker, Hero defender) {
    }

    public boolean resolve(int roll){

        return roll > 10;
    }
}
