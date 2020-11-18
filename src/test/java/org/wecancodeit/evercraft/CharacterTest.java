package org.wecancodeit.evercraft;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CharacterTest {

    private Character underTest;

    @BeforeEach
    void setUp() {
        underTest = new Character("name", "alignment");
    }

    @Test
    public void shouldBeAbleToCreateACharacter() {

    }
    @Test
    public void characterShouldHaveAName(){
        String name = underTest.getName();
        assertThat(name).isEqualTo("name");
    }

    @Test
    public void characterShouldBeAbleToChangeName(){
        underTest.setName("newName");
        assertThat(underTest.getName()).isEqualTo("newName");
    }

    @Test
    public void characterShouldHaveAnAlignment(){
        String alignment = underTest.getAlignment();
        assertEquals(alignment, "alignment");
    }

}