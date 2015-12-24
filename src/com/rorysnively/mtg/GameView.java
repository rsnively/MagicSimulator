package com.rorysnively.mtg;

import java.awt.Color;
import javax.swing.JPanel;

public class GameView extends JPanel {

    private static Color backgroundColor = new Color(192, 192, 192);

    private Game game;

    public GameView() {
        game = new Game();
        setBackground(backgroundColor);
    }

    private void Draw() {
        for (Card c : game.GetPlayerHand()) {
            CardView cardView = new CardView(c.GetName());
            add(cardView);
        }
    }
}
