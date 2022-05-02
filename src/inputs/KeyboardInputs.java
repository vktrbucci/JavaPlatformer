package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println("A key was typed.");
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                this.gamePanel.changeYDelta(-5);
                break;
            
            case KeyEvent.VK_A:
                this.gamePanel.changeXDelta(-5);
                break;

            case KeyEvent.VK_S:
                this.gamePanel.changeYDelta(5);
                break;

            case KeyEvent.VK_D:
                this.gamePanel.changeXDelta(5);
                break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("A key was released.");
        
    }
    
}
