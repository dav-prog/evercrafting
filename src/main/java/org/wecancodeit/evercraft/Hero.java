package org.wecancodeit.evercraft;

public class Hero {

    private String name;
    private Alignment alignment;
    private int armorClass = 10;
    private int hitPoints = 5;



    private int damage = 0;

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
        return armorClass;
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
}
