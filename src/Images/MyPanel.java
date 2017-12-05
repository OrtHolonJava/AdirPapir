package Images;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel
{
	private Img _img;
	public MyPanel()
	{
		_img = new Img("Images\\rolit.jpg", 0, 0, 1000, 1000);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		_img.drawImg(g);
	}
}
