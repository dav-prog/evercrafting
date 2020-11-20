package org.wecancodeit.evercraft;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.wecancodeit.evercraft.Alignment.*;


class HeroTest {

    private Hero underTest;
    private Attack attack;

    @BeforeEach
    void setUp() {
        underTest = new Hero("name", NEUTRAL);
        attack = new Attack(underTest, underTest);
    }

    @Test
    public void shouldBeAbleToCreateAHero() {
    }

    @Test
    public void heroShouldBeAbleToChangeName() {
        underTest.setName("newName");
        assertThat(underTest.getName()).isEqualTo("newName");
    }

    @Test
    public void heroShouldHaveAnAlignment() {
        Alignment alignment = underTest.getAlignment();
        assertEquals(alignment, NEUTRAL);
    }

    @Test
    public void alignmentCanBeEvil() {
        underTest.setAlignment(EVIL);
        assertThat(underTest.getAlignment()).isEqualTo(EVIL);
    }

    @Test
    public void alignmentCanBeGood() {
        underTest.setAlignment(GOOD);
        assertThat(underTest.getAlignment()).isEqualTo(GOOD);
    }

    @Test
    public void hasAnArmorClassDefaultOf10() {
        underTest.getArmorClass();
        assertThat(underTest.getArmorClass()).isEqualTo(10);
    }

    @Test
    public void hitPointDefaultOf5() {
        underTest.getHitPoints();
        assertThat(underTest.getHitPoints()).isEqualTo(5);
    }

    @Test
    public void hitsWhenAttackBeatsArmorClass() {
        Hero attacker = new Hero("attacker", NEUTRAL);
        Hero defender = new Hero("defender", NEUTRAL);
        Attack attack = new Attack(attacker, defender);
        assertTrue(attack.resolve(11));
    }

    @Test
    public void missesWhenRollIsLessThanArmorClass() {
        Hero attacker = new Hero("attacker", NEUTRAL);
        Hero defender = new Hero("defender", NEUTRAL);
        Attack attack = new Attack(attacker, defender);
        assertFalse(attack.resolve(9));
    }

    @Test
    public void hitsWhenAttackMeetsArmorClass() {
        Hero attacker = new Hero("attacker", NEUTRAL);
        Hero defender = new Hero("defender", NEUTRAL);
        Attack attack = new Attack(attacker, defender);
        assertTrue(attack.resolve(10));
    }

    @Test
    public void onePointOfDamageDecreaseHitPointsByOne() {
        underTest.damage(1);
        assertThat(underTest.getHitPoints()).isEqualTo(4);
    }

    @Test
    public void HeroIsAliveDefault() {
        assertTrue(underTest.isAlive());
    }

    @Test
    public void DeadIfMoreDamagePointsThanHP() {
        underTest.damage(6);
        assertFalse(underTest.isAlive());
    }

    @Test
    public void rollNatural20AndDamageIsDoubled() {
        attack.resolve(20);
        assertEquals(2, underTest.getDamage());
    }


}