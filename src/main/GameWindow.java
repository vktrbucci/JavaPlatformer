package main;

import javax.swing.JFrame;

public class GameWindow {
    
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        jframe = new JFrame();

        jframe.setSize(640, 480);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null); // Makes the jframe appear in the center of the screen
        jframe.setVisible(true);    // This method must be at the bottom
    }


}
