package com.rorysnively.mtg;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<Card>();
        hand.add(new Card("EliteVanguard"));
        hand.add(new Card("EliteVanguard"));
    }

    public ArrayList<Card> GetHand() { return hand; }
}
