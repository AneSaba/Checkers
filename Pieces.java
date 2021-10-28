//Aneesh Saba
//Period 2
import java.util.*;
import java.io.*;
public class Pieces
{
	private int xcord;
	private int ycord;
	private boolean king;
	private boolean isWhite;

	public Pieces(int x, int y, boolean pieceIsWhite)
	{
		king = false;
		xcord = x;
		ycord = y;
		isWhite = pieceIsWhite;
	}

	public int getX()
	{
		return xcord;
	}

	public int getY()
	{
		return ycord;
	}
	public void setX(int x)
	{
		xcord = x;
	}

	public void setY(int y)
	{
		ycord = y;
	}

	public boolean isKing()
	{
		if((ycord == 0 && isWhite==true)||(ycord == 7 && isWhite==false))
			king = true;
		return king;
	}

	public boolean isWhite()
	{
		return isWhite;
	}

	public String toString()
	{
		return "I am a " + (king ? "king" : "normal piece") + " at " + Integer.toString(xcord) + " , "  + Integer.toString(ycord) + ".";
	}
}