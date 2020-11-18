package org.wecancodeit.evercraft;

public class Character {

    private String name;
    private String alignment;

    public Character(String name, String alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }


    public String getAlignment() {
        return alignment;
    }
}
