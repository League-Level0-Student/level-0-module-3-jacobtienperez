//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(999999999)+1;
		
		// 2. Print out the random variable above
	
		// 11. Repeat steps 1 to 10 ten times
		    for(int i =0; i<10; i++) {
		    	
		    
			// 1. Ask the user for a guess using a pop-up window, and save their response 
            String Mario=JOptionPane.showInputDialog("guess");
            
            
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int numm=Integer.parseInt(Mario);
			// 5. if the guess is correct
				// 6. Win
			      if(numm==random) {
			    	 JOptionPane.showMessageDialog(null, "YOU WON! For eel.");
			    	 System.exit(0);
			      }
			      
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			      
			// 7. if the guess is high
			      if(numm>random) {
			    	  JOptionPane.showMessageDialog(null, "Your guess is to high. As punishment you will be sent to the shadow realm");
			      }
				// 8. Tell them it's too high
			// 9. if the guess is low
			      if(numm<random) {
			    	  JOptionPane.showMessageDialog(null, "Your guess is too low you will be crucified");
			      }
				// 10. Tell them it's too low
			      
			      JOptionPane.showMessageDialog(null, "Wow your luck sucks");

		    }
	}
}


