package Images;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Square extends JPanel
{
	private int _row;
	private int _col;
	private enum soldier {green, yellow, blou, red, empty};
	private Img _imgSoldier;
	private boolean _isEmpty;
	
	public Square(int row, int col, Img imgSoldier) 
	{
		_row = row;
		_col = col;
		_imgSoldier = imgSoldier;
		_isEmpty = true;
	}
	
	public void draw(Graphics g)
	{
		_imgSoldier.drawImg(g);
	}
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		_imgSoldier.drawImg(g);
	}
}
