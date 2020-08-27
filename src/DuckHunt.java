import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DuckHunt {
	JFrame frame;
	JButton button;
GamePanel gamepanel = new GamePanel();
	public static int WIDTH = 1500;
	public static int HEIGHT = 1050;

	DuckHunt() {
		frame = new JFrame();
		frame.add(gamepanel);
		frame.setVisible(true);
		button = new JButton();
		button.setVisible(true);
		button.setText("Click Here to start game");
		frame.add(button);
		JOptionPane.showMessageDialog(null, "press enter again to start playing");

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
