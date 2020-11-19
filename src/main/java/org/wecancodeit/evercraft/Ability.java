package org.wecancodeit.evercraft;

public class Ability {

    private int score = 10;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score > 20) {
            score = 20;
        }
        if (score < 0) {
            score = 0;
        }
        { this.score = score; }
    }

    public int modifier() {
        return Math.floorDiv(this.score - 10 , 2) ;
    }

    public int getModifier() {
        return modifier();
    }
}




