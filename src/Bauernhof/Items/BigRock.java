package Bauernhof.Items;

import java.util.Random;

public class BigRock extends Items implements RainIF,  BuildableIF, ThunderstormIF
{
	Random rando = new Random();
	
	public BigRock() 
	{
		
	}

	

	@Override
	public void placeBuildings(Items[][][] grid, Buildings b) {
		
	}



	@Override
	public boolean isWet() {
		return false;
	}


	@Override
	public boolean lightning() {
	    return rando.nextDouble() < 0.05;
	}
	
}
