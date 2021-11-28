import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
ArrayList<Obstacle> o=new ArrayList<Obstacle>();
Player p;
Random r = new Random ();
ObjectManager (Player p) {

	
}
void addObstacle(){
	o.add(new Obstacle(r.nextInt(Tylerstache.WIDTH),0,50,50));
}
void update(){
for(int i = 0; i <= 10; i = i + 2) {
}
}}
