import java.awt.Color;
import java.awt.Graphics;

public class Obstacle  extends GameObject {

	Obstacle(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	void draw(Graphics g) {
	      g.setColor(Color.YELLOW);
	        g.fillRect(x, y, 50, 50);
	        //Obstacle.add(new Obstacle(random.nextInt(Obstacle.WIDTH),0,50,50));  
	}
	
	public void update() {
		y+=speed;
		
	}
	
}
