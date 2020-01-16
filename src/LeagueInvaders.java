import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel gp;
	JFrame frame;

	public static final int Width = 500;
	public static final int Height = 800;

	LeagueInvaders() {

		frame = new JFrame();
		gp = new GamePanel();
	}

	public static void main(String[] args) {

		LeagueInvaders l = new LeagueInvaders();
		l.setup();

	}

	void setup() {

		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(Width, Height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.add(gp);

	}

}
