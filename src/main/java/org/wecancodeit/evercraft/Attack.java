package org.wecancodeit.evercraft;

public class Attack {

    private Hero attacker;
    private Hero defender;

    public Attack(Hero attacker, Hero defender) {

        this.attacker = attacker;
        this.defender = defender;
    }

    public boolean resolve(int roll) {
        boolean hit = (roll >= defender.getArmorClass());
        boolean critical = (roll == 20);

        if (hit && critical) {
            defender.damage(2);
        } else if (hit) {
            defender.damage(1);
        }

        return hit;
    }
}
