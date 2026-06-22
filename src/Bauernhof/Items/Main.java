package Bauernhof.Items;

import Bauernhof.factory.*;

public class Main 
{

	 public static void main(String[] args)
	    {
	        Map map = new Map();
	        map.generateFields();
	        map.generateBuildings();
	        map.generateVehicle();

	        Items[][][] fields = map.getGrid();

	        map.printGrid(fields);
	        
	        Weather weather = new Weather(); 
	        
	        weather.simulateRain(fields);
	        weather.simulateLightning(fields, map);
	    }
}