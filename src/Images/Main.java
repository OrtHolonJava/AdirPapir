package Images;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args)
	{
		BoardPanel bp = new BoardPanel();
		JFrame frame = new JFrame("rolit");
		frame.add(bp);
		frame.setVisible(true);
		frame.setSize(900, 900);

		
		//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
