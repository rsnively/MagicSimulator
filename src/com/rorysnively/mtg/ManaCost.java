package com.rorysnively.mtg;

public class ManaCost {
    private int white;
    private int blue;
    private int black;
    private int red;
    private int green;
    private int generic;

    public ManaCost(int w, int u, int b, int r, int g, int generic) {
        this.white = w;
        this.blue = u;
        this.black = b;
        this.red = r;
        this.green = g;
        this.generic = generic;
    }

    public ManaCost() {
        this(0, 0, 0, 0, 0, 0);
    }

    // Assume mana cost string of the form [generic mana][other mana]
    public ManaCost(String s) {
        this();
        int genericCount = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'W': this.white++; break;
                case 'U': this.blue++; break;
                case 'B': this.black++; break;
                case 'R': this.red++; break;
                case 'G': this.green++; break;
                default: genericCount *= 10; genericCount += Character.getNumericValue(s.charAt(i));
            }
        }
        this.generic = genericCount;
    }

    public int ConvertedManaCost() {
        return this.white + this.blue + this.black + this.red + this.green + this.generic;
    }

    public void AddMana(MTGColor color, int amount) {
        switch (color) {
            case White:
                this.white += amount;
                break;
            case Blue:
                this.blue += amount;
                break;
            case Black:
                this.black += amount;
                break;
            case Red:
                this.red += amount;
                break;
            case Green:
                this.green += amount;
                break;
            // TODO: These need to be differentiated eventually (but difficult because generic is not a color...
            case Colorless:
                this.generic += amount;
                break;
        }
    }

    public void AddMana(MTGColor color) {
        this.AddMana(color, 1);
    }

    public void SubtractMana(MTGColor color, int amount) {
        switch (color) {
            case White:
                this.white = Math.max(this.white - amount, 0);
                break;
            case Blue:
                this.blue = Math.max(this.blue - amount, 0);
                break;
            case Black:
                this.black = Math.max(this.black - amount, 0);
                break;
            case Red:
                this.red = Math.max(this.red - amount, 0);
                break;
            case Green:
                this.green = Math.max(this.green - amount, 0);
                break;
            // TODO: These need to be differentiated eventually (but difficult because generic is not a color...
            case Colorless:
                this.generic = Math.max(this.generic - amount, 0);
                break;
        }
    }

    public void SubtractMana(MTGColor color) {
        this.SubtractMana(color, 1);
    }
}
