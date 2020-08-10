import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.function.Function;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
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
		loadImage("download.png");
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

	private void drawEndState(Graphics g) {
		// TODO Auto-generated method stub

	}

	private void drawGameState(Graphics g) {
		// TODO Auto-generated method stub

	}

	private void drawMenuState(Graphics g) {
		g.drawImage(bgImage, 0, 0, DuckHunt.WIDTH, DuckHunt.HEIGHT, null);

	}

	void loadImage(String imageFile) {

		try {
			bgImage = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	private void drawCrossHair(Graphics g){
	    Color yellow = new Color (0xEDFF62);
	    g.setColor(yellow);
	    for (int i = 0; i < 1; i++) {
	    g.drawOval(crosshair.x + i, crosshair.y + i, 40 - i - i, 40 - i - i);
	    }
	    g.fillArc(crosshair.x + 10, crosshair.y + 21 , 20, 20, -45, -90);
	    g.fillArc(crosshair.x - 1, crosshair.y + 10, 20, 20, -135, -90);
	    g.fillArc(crosshair.x + 10, crosshair.y - 1, 20, 20, -225, -90);
	    g.fillArc(crosshair.x + 21, crosshair.y + 10, 20, 20, -315, -90);
	}
