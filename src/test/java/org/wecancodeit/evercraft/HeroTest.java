package org.wecancodeit.evercraft;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class HeroTest {

    private Hero underTest;

    @BeforeEach
    void setUp() {
        underTest = new Hero("name", "Neutral");
    }

    @Test
    public void shouldBeAbleToCreateAHero() {

    }
    @Test
    public void heroShouldHaveAName(){
        String name = underTest.getName();
        assertThat(name).isEqualTo("name");
    }

    @Test
    public void heroShouldBeAbleToChangeName(){
        underTest.setName("newName");
        assertThat(underTest.getName()).isEqualTo("newName");
    }

    @Test
    public void heroShouldHaveAnAlignment(){
        String alignment = underTest.getAlignment();
        assertEquals(alignment, "Neutral");
    }

    @Test
    public void alignmentCanBeEvil(){
        underTest.setAlignment("Evil");
        assertThat(underTest.getAlignment()).isEqualTo("Evil");
    }


}