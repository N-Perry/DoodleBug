package doodle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class World {
	public final int size = 5;
	Bug grid[][] = new Bug[size][size];
	JFrame gridFrame = new JFrame("Doodle");
	JLabel labels[][] = new JLabel[size][size];
	int tempX, tempY;
	
	World() {
		gridFrame.setLayout(new GridLayout(size,size));
		//System.out.println(labels.length);
		populate();
		toConsole();
	}
	
	void populate() {
		for(int i = 0; i < size; i++) {
			for(int i2 = 0; i2 < size; i2++) {
				grid[i][i2] = new Bug(0);
				labels[i][i2] = new JLabel("[ ]");
				gridFrame.getContentPane().add(labels[i][i2]);
			}
		}
	}
	
	boolean isTaken(Bug b) {
		if(b.getType() == 0) {
			return true;
		}
		else return false;
	}
	
	void toConsole() {
		for(int i = 0; i < size; i++) {
			for(int i2 = 0; i2 < size; i2++) {
				System.out.print(labels[i][i2].getText());
			}
			System.out.println();
		}
	}
}
