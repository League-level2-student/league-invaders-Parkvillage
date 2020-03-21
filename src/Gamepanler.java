import java.awt.Graphics;
import javax.swing.JPanel;

public class Gamepanler {
	public class GamePanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			g.fill3DRect(10, 10, 100, 100, true);
		}
	}
}
