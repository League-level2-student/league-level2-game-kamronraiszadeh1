import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * first class would be a class displaying the rules and how to play then space bar to start (copy and paste league invaders)
 * person running class includes arrow keys 
 * obstacles class some on the ground and some in the air
 * class at end where it tells u ur score
 */
public class Tylerstache {
	public static final int WIDTH=1000;
	public static final int HEIGHT = 500;
	
	JFrame f;
	GamePanel g;
	Tylerstache(){
		f=new JFrame();
		g=new GamePanel();
		f.addKeyListener(g);
	}

	public static void main(String[] args) {
		Tylerstache guy = new Tylerstache();
				guy.setup();
	}
void setup (){
	f.add(g);
	f.setSize(WIDTH,HEIGHT);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}