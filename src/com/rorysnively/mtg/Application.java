package com.rorysnively.mtg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application extends JFrame {
    private GameView gameView;
    private JMenuBar menuBar;

    public Application() {
        InitUI();
    }

    private void InitUI() {
        setTitle("Magic: the Gathering Simulator");
        setSize(1400, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

       InitMenuBar();

        gameView = new GameView();
        add(gameView);
    }

    private void InitMenuBar() {
        JMenu menu;
        JMenuItem menuItem;

        menuBar = new JMenuBar();

        menu = new JMenu("Game");
        menuBar.add(menu);
        menuItem = new JMenuItem("New Game");
        menuItem.getAccessibleContext().setAccessibleDescription("TODO: implement me");
        menu.add(menuItem);
        menuItem = new JMenuItem("Quit Game");
        menuItem.getAccessibleContext().setAccessibleDescription("TODO: implement me");
        menu.add(menuItem);

        menu = new JMenu("Options");
        menuBar.add(menu);
        menuItem = new JMenuItem("I assume we'll have some of these eventually?");
        menuItem.getAccessibleContext().setAccessibleDescription("TODO: implement me");
        menu.add(menuItem);

        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
                Application application = new Application();
                application.setVisible(true);
            }
        });
    }
}
