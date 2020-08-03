import javax.swing.JFrame;

public class DuckHunt {
	JFrame frame;
	
	public static int WIDTH = 1000;
	public static int HEIGHT = 800;
	DuckHunt(){
	frame = new JFrame();
	}
	
public static void main(String[] args) {
DuckHunt duckhunt = new DuckHunt();
duckhunt.setup();
}
void setup(){

	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
}
}
