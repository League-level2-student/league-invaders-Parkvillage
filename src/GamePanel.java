import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;

	int currentState = MENU;
	
	Font titleFont;
	Font subFont;
	//------------Constructor------------
	
	GamePanel(){
		 titleFont = new Font("Courier", Font.PLAIN, 48);
		 subFont= new Font("Courier", Font.PLAIN, 20);
	}
	
   //-------------Ends Here--------------
	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU) {
			drawMenuState(g);
		} 
		
		else if (currentState == GAME) {
			drawGameState(g);
		} 
		
		else if (currentState == END) {
			drawEndState(g);
		}

	}
	//------------Update stuff------------
	
	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	//------------Drawing stuff----------------
	
	void drawMenuState(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE INVADERS", 20, 200);
		
		g.setFont(subFont);
		g.setColor(Color.YELLOW);
		g.drawString("press ENTER to start", 100, 300);
		
		g.setFont(subFont);
		g.setColor(Color.ORANGE);
		g.drawString("or press SPACE for instructions", 30, 350);
	}

	void drawGameState(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);

	}

	void drawEndState(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Game over", x, y);

	}

}
