package Bauernhof.factory;

import Bauernhof.Items.*;
import java.util.Random;

public class constructionGuild extends Factory 
{
	Random r = new Random();
	
	public Buildings produce() 
	{
		int building = r.nextInt(3);
		
		switch(building) 
		{
		case 0: return new Apartment();
		case 1: return new Stables();
		case 2: return new Commercial();
		default: throw new IllegalArgumentException("Unbekannt");
		}
	}
}
