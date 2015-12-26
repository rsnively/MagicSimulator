package com.rorysnively.mtg;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CardView extends JPanel {

    private Card card;

    // TODO: actual card colors
    public static Color whiteCardColor = Color.gray.brighter().brighter().brighter();
    public static Color blueCardColor = Color.cyan;
    public static Color blackCardColor = Color.gray.darker().darker();
    public static Color redCardColor = Color.red.darker();
    public static Color greenCardColor = Color.green.darker().darker();
    public static Color colorlessCardColor = Color.gray.brighter();

    private Color backgroundColor;
    private int borderThickness;

    public CardView(String name) {
        setBackground(GameView.backgroundColor);
        card = new Card(name);

        switch (card.GetColor()) {
            case White: backgroundColor = whiteCardColor; break;
            case Blue: backgroundColor = blueCardColor; break;
            case Black: backgroundColor = blackCardColor; break;
            case Red: backgroundColor = redCardColor; break;
            case Green: backgroundColor = greenCardColor; break;
            case Colorless: backgroundColor = colorlessCardColor; break;
            default: backgroundColor = Color.yellow;
        }
        borderThickness = 12;

    }

    @Override public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        // TODO: Card View of variable size (get actual dimensions)
        PaintBorder(g2);
        PaintBackground(g2);
        PaintTopPanel(g2);
            PaintCardName(g2);
            PaintManaCost(g2);
        PaintImage(g2);
        PaintMiddlePanel(g2);
            PaintCardType(g2);
            PaintSetSymbol(g2);
        PaintMainPanel(g2);
        PaintPowerToughness(g2);

        g2.dispose();
    }

    private void PaintBackground(Graphics2D g) {
        g.setColor(backgroundColor);
        g.fill(new Rectangle(borderThickness / 2, borderThickness / 2, getWidth() -  borderThickness, getHeight() - borderThickness));
    }

    private void PaintBorder(Graphics2D g) {
        g.setColor(Color.black);
        g.setStroke(new BasicStroke(borderThickness));
        g.draw(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
    }

    private void PaintTopPanel(Graphics2D g) {
        // TODO
    }

    private void PaintCardName(Graphics2D g) {
        g.setColor(Color.black);
        g.drawString(card.GetName(), (float) 1.4 * borderThickness, (float) 1.4 * borderThickness);
    }

    private void PaintManaCost(Graphics2D g) {
        Image image = new ImageIcon("res/mana/White.png").getImage();
        g.drawImage(image, getWidth() - 12 - borderThickness, borderThickness, 12, 12, null);
    }

    private void PaintImage(Graphics2D g) {
        Image image = new ImageIcon("res/card/EliteVanguard.jpg").getImage();
        g.drawImage(image, (getWidth() - image.getWidth(null)) / 2 , 20, null);
    }

    private void PaintMiddlePanel(Graphics2D g) {
        // TODO
    }

    private void PaintCardType(Graphics2D g) {
        // TODO
    }

    private void PaintSetSymbol(Graphics2D g) {
        // TODO
    }

    private void PaintMainPanel(Graphics2D g) {
        // TODO
    }

    private void PaintPowerToughness(Graphics2D g) {
        // TODO
    }
}