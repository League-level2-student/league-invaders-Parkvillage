import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	


	Rocketship(int x, int y, int width, int height) {
		
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("rocket.png");
		}
		speed=10;
		// TODO Auto-generated constructor stub
	}
	
	void draw(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		
	}
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
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
