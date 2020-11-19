package org.wecancodeit.evercraft;

import java.util.EmptyStackException;

public class Ability {

    private int score = 10;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score > 20) { score = 20; }

        { this.score = score; }
    }
}




