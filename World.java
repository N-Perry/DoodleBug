package doodle;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class World {
	final int size = 5;
	Bug grid[][] = new Bug[size][size];
	World() {}
	
	void populate() {
		for(int i = 0; i < size; i++) {
			for(int i2 = 0; i2 < size; i2++) {
				grid[i][i2] = new Bug(0);
			}
		}
	}
	
}