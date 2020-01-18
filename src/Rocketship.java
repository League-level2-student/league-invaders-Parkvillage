import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	

	Rocketship(int x, int y, int width, int height) {
		
		super(x, y, width, height);
		
		speed=10;
		// TODO Auto-generated constructor stub
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		
	}
	
	//------------MOVEMENT METHODS------------\\
	
	
	public void up() {
		if(y>0) {
			y-=speed;
		}	
	}
	public void down() {
		if(y<800-height) {
		y+=speed;
		}
	}
	public void left() {
		if(x>0) {
		x-=speed;
		}
	}
	public void right() {
		if(x<500-width) {
		x+=speed;
		}
	}
	
	

}
