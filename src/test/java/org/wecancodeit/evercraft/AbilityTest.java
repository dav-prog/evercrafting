package org.wecancodeit.evercraft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilityTest {

    private Ability underTest;


    @BeforeEach
    void setUp() {
        underTest = new Ability();
    }

    @Test
    public void scoreDefaultShouldBe10(){
        assertEquals(10, underTest.getScore());
    }
    @Test
    public void scoreCanChange(){
        underTest.setScore(15);
        assertEquals(15, underTest.getScore());
    }
}
