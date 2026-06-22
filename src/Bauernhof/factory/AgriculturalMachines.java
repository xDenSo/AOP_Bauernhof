package Bauernhof.factory;

import java.util.Random;

import Bauernhof.Items.*;

public class AgriculturalMachines extends Factory 
{
	Random rando = new Random();
	
	public Items produce() 
	{
		int vehicle = rando.nextInt(3);
		
		switch(vehicle) 
		{
		case 0: return new Tractor();
		case 1: return new Van();
		case 2: return new Harvester();
		default: throw new IllegalArgumentException("Unbekannt");
		}
	}
}
