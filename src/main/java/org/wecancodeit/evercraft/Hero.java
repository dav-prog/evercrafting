package org.wecancodeit.evercraft;

public class Hero {

    private String name;
    private Alignment alignment;
    private int ArmorClass = 10;
    private int HitPoints = 5;

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
        return ArmorClass;
    }

    public int getHitPoints() {
        return HitPoints;
    }
}
