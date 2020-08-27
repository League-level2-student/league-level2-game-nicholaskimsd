import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.function.Function;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel 
implements ActionListener, KeyListener {
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font startFont = new Font("Arial", Font.PLAIN, 24);
	Font instructionFont = new Font("Arial", Font.PLAIN, 24);
	BufferedImage bgImage;
	int x = 250;
	

	GamePanel() {
		
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} else if (currentState == GAME) {
			drawGameState(g);
		} else if (currentState == END) {
			drawEndState(g);
		}
	}
void updateMenuState() {
	
}
void updateGameState() {
	
}
void updateEndState() {
	
}
	private void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, WIDTH , HEIGHT);

	}

	private void drawGameState(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, WIDTH , HEIGHT);

	}

	private void drawMenuState(Graphics g) {
		g.drawImage(bgImage, 0, 0, DuckHunt.WIDTH, DuckHunt.HEIGHT, null);

	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		        
		    } else {
		        currentState++;
		    }
		}   
	
		}
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
