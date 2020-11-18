package org.wecancodeit.evercraft;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CharacterTest {
    @Test
    public void shouldBeAbleToCreateACharacter() {
        Character underTest = new Character("name");
    }
    @Test
    public void characterShouldHaveAName(){
        Character underTest = new Character("name");
        String name = underTest.getName();
        assertEquals("name", name);
    }
}