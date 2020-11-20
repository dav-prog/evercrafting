package org.wecancodeit.evercraft;


public class Hero {

    private String name;
    private Alignment alignment;
    private int armorClass = 10;
    private int hitPoints = 5;
    private int score = 10;
    private int damage = 0;
    private int dexterity = 10;
    private int strength = 10;


    public Hero(String name, Alignment alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getArmorClass() {
        return armorClass ;
    }

    public int getHitPoints() {
        return hitPoints - damage;
    }

    public int getDamage() {
        return damage;
    }

    public void damage(int points) {
        this.damage += points;
    }

    public boolean isAlive() {
        return getHitPoints() > 0;
    }

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
        {
            this.score = score;
        }
    }

    public int modifier() {
        return Math.floorDiv(this.score - 10, 2);
    }

    public int getModifier() {
        return modifier();
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

