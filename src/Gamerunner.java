import java.awt.Dimension;

import javax.swing.JFrame;

public class Gamerunner {
	public static final int WIDTH=500;
	public static final int HEIGHT=500;
	JFrame frame;
	Gamerunner(){
		frame= new JFrame();
	}
	
public static void main(String[] args) {
	
    Gamerunner runner= new Gamerunner();
    runner.setup();
}

void setup() {
	
	frame.setVisible(true);
	frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
