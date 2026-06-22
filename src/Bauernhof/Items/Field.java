package Bauernhof.Items;

public class Field extends Property implements BuildableIF
{
	public Field() 
	{
		

	}

	@Override
	public void placeBuildings(Items[][][] grid, Buildings b) {
		int x = getPos().getX()- 'A';
		int y = getPos().getY() -1;
		
		grid[x][y][1] = b;
		
	}
}
