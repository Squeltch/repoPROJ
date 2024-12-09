package main;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;

public class GamePanel extends JPanel implements Runnable{
	//Screen settings
	final int originalTileSize = 16; //default size of F-ing E'rrythang!
	final int scale = 3;
	final int tileSize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 16;
	
	//The code below sets the tile proportions of the screen. Huge thanks to God for RyiSnow, GOAT
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;

	Thread gameThread;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
		
	}
	public void startGameThread() {	
		
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	
	
	@Override
	public void run() {
		
		while (gameThread != null) {
			
		}
		
	}
}
