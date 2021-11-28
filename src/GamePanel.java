import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener  {
	JPanel p = new JPanel();
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font somethingFont;
	Timer frameDraw;
	Player play = new Player(250,350,50,50);


	GamePanel(){
	titleFont = new Font("Arial", Font.PLAIN, 48);
	somethingFont = new Font("Arial", Font.PLAIN, 30);
	frameDraw = new Timer(1000/60,this);
	frameDraw.start();
	
}
	void updateMenuState() {  
		
	}
	void updateGameState() {  
		
	}
	void updateEndState()  { 
	
	}

void drawMenuState(Graphics g) {  
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, Tylerstache.WIDTH, Tylerstache.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.green);
	g.drawString("Mee Game", 25, 100);
	g.setFont(somethingFont);
	g.setColor(Color.green);
	g.drawString("Press Enter to Start", 100, 250);
	g.setFont(somethingFont);
	g.setColor(Color.green);
	g.drawString("Press Space to See Instructions", 50, 400);
}
void drawGameState(Graphics g) {  
	g.setColor(Color.green);
	g.fillRect(0, 0, Tylerstache.WIDTH, Tylerstache.HEIGHT);
	play.draw(g);
}
void drawEndState(Graphics g)  {
	g.setColor(Color.RED);
	g.fillRect(0, 0, Tylerstache.WIDTH, Tylerstache.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.green);
	g.drawString("GAME OVER", 25, 100);
	g.setFont(somethingFont);
	g.setColor(Color.green);
	g.drawString("You Score is", 50, 250);
	g.setColor(Color.green);
	g.drawString("Press Enter to Restart", 50, 400);
	
}
public void paintComponent(Graphics g){
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	   drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
	

}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		    System.out.println("action");
		    repaint();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}   
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
			if (currentState== MENU) {
			  JOptionPane.showMessageDialog(null, "Use arrow keys to get around the obsacles.");
		}
		}
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			if (currentState==GAME) {
				
				play.y-=5;
				
				
				System.out.println("Jump");
		}}
		if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			play.y+=5;
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}