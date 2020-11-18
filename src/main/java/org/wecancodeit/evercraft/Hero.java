package org.wecancodeit.evercraft;

public class Hero {

    private String name;
    private enum  Alignment{Evil, Neutral, Good};
    private String alignment;

    public Hero(String name, String alignment) {
        this.name = name;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlignment() {
        return alignment;
    }
}
