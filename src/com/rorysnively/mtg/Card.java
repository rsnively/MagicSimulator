package com.rorysnively.mtg;

public class Card {
    private String name;
    private MTGColor color;

    public Card(String name) {
        this.name = name;
        this.color = MTGColor.White;
    }

    public String GetName() { return name; }
    public MTGColor GetColor() { return color; }
}
