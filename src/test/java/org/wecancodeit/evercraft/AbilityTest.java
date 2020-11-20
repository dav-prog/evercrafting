package org.wecancodeit.evercraft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.wecancodeit.evercraft.Alignment.NEUTRAL;

public class AbilityTest {

    private Hero underTest;

    @BeforeEach
    void setUp() {
        underTest = new Hero("Hero", NEUTRAL);
    }

    @Test
    public void scoreDefaultShouldBe10() {
        assertEquals(10, underTest.getScore());
    }

    @Test
    public void scoreCanChange() {
        underTest.setScore(15);
        assertEquals(15, underTest.getScore());
    }

    @Test
    public void scoreCannotBeMoreThan21() {
        underTest.setScore(21);
        assertThat(underTest.getScore()).isEqualTo(20);
    }

    @Test
    public void scoreCannotBeLessThan0() {
        underTest.setScore(-5);
        assertThat(underTest.getScore()).isEqualTo(0);
    }

    @Test
    public void scoreAffectsTheModifier() {
        underTest.setScore(2);
        assertThat(underTest.modifier()).isEqualTo(underTest.getModifier());
    }


}




