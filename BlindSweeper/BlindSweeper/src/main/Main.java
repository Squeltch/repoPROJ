package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Blind Sweeper");
		
		JTable table = new JTable();
		window.add(table);
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		window.pack();

		gamePanel.startGameThread();
	}

}

/*
	
	@SuppressWarnings("serial")
	public class mouseInteraction extends JPanel{

		// The code below creates the matrix 
		Random random = new Random();
        boolean[][] matrix = new boolean[8][8]; // makes an array 8x8 format
        int mines = 10;
        Set<Integer> minePos = new HashSet<>();{ // Hash set to stop repetition
        
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
	}

	public static void main(String[] args) {
		//Thanks to RYISNOW for his tutorial on setting up the game window, GOAT
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Blind Sweeper");
		
		window.pack();
		window.setLocationRelativeTo(null);
		
		window.setVisible(true);
		
	} 
}
*/


