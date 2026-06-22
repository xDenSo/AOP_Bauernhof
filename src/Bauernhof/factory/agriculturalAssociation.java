package Bauernhof.factory;

import java.util.Random;

import Bauernhof.Items.*;

public class agriculturalAssociation  extends Factory
{
	Random rando = new Random();
	
	public Items produce() 
	{
		int property = rando.nextInt(3);
		
		switch(property) 
		{
		case 0: return new Field();
		case 1: return new Forest();
		case 2: return new Meadow();
		default: throw new IllegalArgumentException("Unbekannt");
		}
		
	}
}
