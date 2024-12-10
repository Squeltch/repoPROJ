package main;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Dimension;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable{
	//Screen settings
	final int tileSize = 32; //default size of F-ing E'rrythang!
	
	final int maxScreenCol = 16;
	final int maxScreenRow = 16;
		
	//thank God for RyiSnow, GOAT
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;

	Thread gameThread;
	
	public void tablelayout() {
		// The code below creates the matrix 
		Random random = new Random();
	    boolean[][] matrix = new boolean[8][8]; // makes an array 8x8 format
	    int mines = 10;
	    Set<Integer> minePos = new HashSet<>(); // Hash set to stop repetition
		        
		while (minePos.size() < mines) {
			int pos = random.nextInt(65);  // Generate a random number between 0 and 64
			minePos.add(pos);  // HashSet above creates uniqueness for these values(no repeating)
		}
		
		// make the mines
		for (int pos : minePos) {
			int row = pos / 8;  // Find row index
			int col = pos % 8;  // Find column index
		    matrix[row][col] = true;  // Mine found here
		}
		
		
		JTable table = new JTable(matrix.length, matrix[0].length);
		
		for (int row = 0; row < matrix.length;row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				table.setValueAt(matrix[row][col], row, col);
			}
		}
		
		add(new JScrollPane(table));
	}	
	
	
	
		
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