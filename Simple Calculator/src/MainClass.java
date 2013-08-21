import javax.swing.JFrame;

/**
 * <b>Main Class</b>
 * <p>Only class</p>
 * <p></p>
 * @author Cooper Mahring
 */
public class MainClass{
	
	static JFrame frame;
	GUI gui;

	public MainClass() {
		frame = new JFrame("Simple Input Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		gui = new GUI();
		frame.add(gui);
		
		
		gui.repaint();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MainClass();
	}
}
