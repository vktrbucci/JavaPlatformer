package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Graphics;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 120;
    private int yDelta = 100;
    
    public GamePanel() {
        // We can put our event listeners here
        // But it's not a very good practice
        // Because this is going to get very messy real soon
        // Our best shot is to put all our event handlers in a separate package
        // Here we only cll our key listeners

        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(xDelta, yDelta, 400, 50);
    }

    public void changeXDelta(int x) {
        this.xDelta += x;
        repaint();
    }

    public void changeYDelta(int y) {
        this.yDelta += y;
        repaint();
    }

    public void setRectPosition(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }
}
