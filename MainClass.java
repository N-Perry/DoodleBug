package doodle;

import javax.swing.*;

public class MainClass {
	  public static void main(String args[]) {  
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() { 
				new World(); //Aladin reference.
			} 
		}); 
	}
}
