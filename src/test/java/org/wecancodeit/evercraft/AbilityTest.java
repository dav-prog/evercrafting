package org.wecancodeit.evercraft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilityTest {

    private Ability underTest;

    @Test
    public void scoreDefaultShouldBe10(){
        underTest = new Ability();
        assertEquals(10, underTest.score());
    }
}
