package org.wecancodeit.evercraft;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.wecancodeit.evercraft.Alignment.*;


class HeroTest {

    private Hero underTest;

    @BeforeEach
    void setUp() {
        underTest = new Hero("name", NEUTRAL);
    }

    @Test
    public void shouldBeAbleToCreateAHero() {
}

    @Test
    public void heroShouldBeAbleToChangeName(){
        underTest.setName("newName");
        assertThat(underTest.getName()).isEqualTo("newName");
    }

    @Test
    public void heroShouldHaveAnAlignment(){
        Alignment alignment = underTest.getAlignment();
        assertEquals(alignment, NEUTRAL);
    }

    @Test
    public void alignmentCanBeEvil(){
        underTest.setAlignment(EVIL);
        assertThat(underTest.getAlignment()).isEqualTo(EVIL);
    }

    @Test
    public void alignmentCanBeGood(){
        underTest.setAlignment(GOOD);
        assertThat(underTest.getAlignment()).isEqualTo(GOOD);
    }

}