package com.rorysnively.mtg;

import java.util.ArrayList;

public class Game {
    private ArrayList<Card> playerLibrary;
    private ArrayList<Card> aiLibrary;
    private ArrayList<Card> playerHand;
    private ArrayList<Card> aiHand;
    private ArrayList<Card> playerGraveyard;
    private ArrayList<Card> aiGraveyard;

    public Game() {
        playerLibrary = new ArrayList<Card>();
        playerLibrary = new ArrayList<Card>();
        aiLibrary = new ArrayList<Card>();
        playerHand = new ArrayList<Card>();
        aiHand = new ArrayList<Card>();
        playerGraveyard = new ArrayList<Card>();
        aiGraveyard = new ArrayList<Card>();
    }

    public ArrayList<Card> GetPlayerLibrary() { return playerLibrary; }
    public ArrayList<Card> GetPlayerHand() { return playerHand; }
}
