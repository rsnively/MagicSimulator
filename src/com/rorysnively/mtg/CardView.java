package com.rorysnively.mtg;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CardView extends JPanel {

    private Card card;

    public CardView(String name) {
        setBackground(Color.black);
        card = new Card(name);

        try {
            BufferedImage image = ImageIO.read(new File("res/cardimages/EliteVanguard.jpg"));
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            add(imageLabel);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}