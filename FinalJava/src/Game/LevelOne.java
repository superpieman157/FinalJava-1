package Game;

import javax.swing.JOptionPane;

import java.util.Random;

public class LevelOne {

	public static void LevelOne() 
	{
		String chipChoice;
		
		Random rand = new Random();
		
     	  int E = rand.nextInt(2) + 1;
        
		chipChoice = JOptionPane.showInputDialog(null,
		        "What Is Your Favorite chip?",
		        "A Questioning Box",
		        JOptionPane.QUESTION_MESSAGE);
		
        JOptionPane.showMessageDialog(null, "Hello and welcome to... ",
       		 "A Welcoming box", 
       		 JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "The Time Killer",
       		 "An Evil Box", 
       		 JOptionPane.ERROR_MESSAGE);
        
        int KeepGoing = JOptionPane.showConfirmDialog(null, 
       		 "Have you ever been so betrayed you'd do anything to get them back?", 
       		 "A Question box", JOptionPane.YES_NO_OPTION);
        if(KeepGoing == JOptionPane.NO_OPTION)
        {
       	  if (E == 1)
       	  {
       		  JOptionPane.showMessageDialog(null, "Then I want you to play this game to "
       		  		+ "\nshow you how sweet revenge can be. "
       		  		+ "\nThere is a catch though if you get caught this experiment "
       		  		+ "\nwill end and you will go to "
       		  		+ "\njail for the rest of your life.",
       		  		"An Evil Box",
       		  		JOptionPane.ERROR_MESSAGE);
       		  
       	  }
       	  else
       	  {
       		  System.exit(0);
       	  }
        }
        else
        {
        	if (E == 1)
        	{
        		JOptionPane.showMessageDialog(null, "Then I want you to play this game to "
           		  		+ "\nshow you how sweet revenge can be. "
           		  		+ "\nThere is a catch though if you get caught this experiment "
           		  		+ "\nwill end and you will go to "
           		  		+ "\njail for the rest of your life. ",
           		  		"An Evil Box",
           		  		JOptionPane.ERROR_MESSAGE);
        		LevelTwo.LevelTwo(chipChoice);
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, " You have chosen to continue. "
        				+ "Lets begin the game.",
        				"A Continuation box",
        				JOptionPane.PLAIN_MESSAGE);
        		LevelTwo.LevelTwo(chipChoice);
        	}
        }
		
	}

	

}
