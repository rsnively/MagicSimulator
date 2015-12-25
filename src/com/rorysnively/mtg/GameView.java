package com.rorysnively.mtg;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GameView extends JPanel {

    public static Color backgroundColor = new Color(192, 192, 192);

    private Game game;

    public GameView() {
        game = new Game();
        setBackground(backgroundColor);
        setLayout(null);
        Draw();
    }

    private void Draw() {
        ArrayList<Card> Hand = game.GetPlayer().GetHand();
        for (int i = 0; i < Hand.size(); i++) {
            Card c = Hand.get(i);
            CardView cardView = new CardView(c.GetName());
            cardView.setSize(250, 350);
            cardView.setLocation(i * 400, 300);
            add(cardView);

        }
    }
}
