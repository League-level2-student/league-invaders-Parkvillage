import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
	Rocketship rocket= new Rocketship(250, 700, 50, 50);
	

	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;

	int currentState = MENU;
	
	Font titleFont;
	Font subFont;
	
	Timer frameDraw;
	
	ObjectManager o= new ObjectManager(rocket);
	
	//------------Constructor------------
	
	GamePanel(){
		 titleFont = new Font("Courier", Font.PLAIN, 48);
		 subFont= new Font("Courier", Font.PLAIN, 20);
		 
		 frameDraw = new Timer(1000/60, this);
		 frameDraw.start();
		
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
     o.update();
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
		
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		
		o.draw(g);
		
		

	}

	void drawEndState(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.Width, LeagueInvaders.Height);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Game over", 20, 200);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	    System.out.println("action");
	    repaint();
		
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		
		  
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    
		    } else {
		        currentState++;
		        System.out.println("state Changed");
		    }
		   
		} 
		if(currentState==GAME) {
			     if (e.getKeyCode()==KeyEvent.VK_UP) {
			        rocket.up();
			    }if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			        rocket.down();
			    }
			    if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			        rocket.left();
			    }
			    if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			        rocket.right();
			    }
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
