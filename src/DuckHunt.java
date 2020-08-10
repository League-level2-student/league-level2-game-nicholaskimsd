import javax.swing.JFrame;

public class DuckHunt {
	JFrame frame;
GamePanel gamepanel = new GamePanel();
	public static int WIDTH = 1500;
	public static int HEIGHT = 1050;

	DuckHunt() {
		frame = new JFrame();
		frame.add(gamepanel);
		
	}

	public static void main(String[] args) {
		DuckHunt duckhunt = new DuckHunt();
		duckhunt.setup();
	}

	void setup() {

		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
