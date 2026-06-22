package Bauernhof.Items;

public class GridPosition extends Position
{
	private char x;
	private int y;
	
	public GridPosition(char x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public char getX() {
		
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

}
