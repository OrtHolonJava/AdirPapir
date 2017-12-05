package Images;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

import com.sun.prism.Image;

import sun.java2d.pipe.DrawImage;

public class BoardPanel extends JPanel 
{
	private Square [][] _board;
	public BoardPanel()
	{
		super();
		Img pic;
		pic = new Img("Images\\ButtonGray.png", 0 , 0 , 100, 100);
		setLayout(new GridLayout(8,8));
		_board = new Square [8][8];
		for (int i = 0; i < 8; i++) 
		{
			for (int j = 0; j < 8; j++) 
			{
				_board [i][j] = new Square(i, j, pic);
				add(_board[i][j]);
			}
		}
		
	}

	public Square[][] getBoard() 
	{
		return _board;
	}

	public void setBoard(Square[][] board) 
	{
		_board = board;
	}
}
