package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Graphics;

public class GamePanel extends JPanel {
    
    public GamePanel() {
        // We can put our event listeners here
        // But it's not a very good practice
        // Because this is going to get very messy real soon
        // Our best shot is to put all our event handlers in a separate package
        // Here we only cll our key listeners

        addKeyListener(new KeyboardInputs());
        addMouseListener(new MouseInputs());

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(120, 100, 400, 50);
    }
}
