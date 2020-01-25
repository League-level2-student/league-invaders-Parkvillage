import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship r;
	Random rand= new Random();
	ArrayList<Projectile> projectiles= new ArrayList <Projectile>();
	ArrayList<Alien> aliens= new ArrayList <Alien>();
	ObjectManager(Rocketship r){
		this.r=r;
		
	}
	
	//------------void methods------------\\
	
	void addProjectiles(Projectile p) {
		projectiles.add(p);
	}
	void addAlien(Alien a) {
		aliens.add(new Alien(rand.nextInt(LeagueInvaders.Width),0,50,50));
		aliens.add(a);
	}
	void update() {
		for(int i=0; i< aliens.size(); i++) {
			aliens.get(i).update();
		
			if(aliens.get(i).y==LeagueInvaders.Height) {
				aliens.get(i).isActive= false;
			}
		}
		for(int i=0; i< projectiles.size(); i++) {
			projectiles.get(i).update();
		
			if(projectiles.get(i).y==0) {
				projectiles.get(i).isActive= false;
			}
		}
	
	}
	void draw(Graphics g) {
		r.draw(g);
		for(int i= 0;i<aliens.size();i++) {
			aliens.get(i).draw(g);
		}
		for(int i= 0;i<projectiles.size();i++) {
			projectiles.get(i).draw(g);
		}
		
		
	}
	void PurgeObjects() {
		for(int i=0;i<aliens.size();i++) {
			if(aliens.get(i).isActive==false) {
				aliens.remove(i);
			}
		}
		for(int i=0;i<projectiles.size();i++) {
			if(projectiles.get(i).isActive==false) {
				projectiles.remove(i);
			}
	}
}
}
