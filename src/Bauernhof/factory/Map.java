package Bauernhof.factory;

import java.util.Random;

import Bauernhof.Items.*;

public class Map 
{
	
	Random rando = new Random();

	char[] xValues = {'A','B','C','D','E'};
	
	// Konstruktor fehlt, da sollte dieses new Items.. rein, das willst du ja nur 1mal aufrufen
	Items[][][] grid = new Items[5][5][3];
	
	
	public Items[][][] getGrid() {
		return grid;
	}



	public Position calculatePosition(int i, int j) 
	{
		char x = (char)(xValues[i]);
		int y = j+1;
		
		return new GridPosition(x,y);
	}
	
	
	public void generateFields() 
	{
		
		for(int i=0; i<5;i++) 
		{
			for(int j= 0; j <5;j++) 
			{
				// dies reicht, wenn du das einmal außerhalb der For-Schleife aufrufst, du brauchst nicht mehre Instanzen davon
				ProducerIF agriAssociation = Factory.create(2);
				
				grid[i][j][0] = agriAssociation.produce();
				grid[i][j][0].setPos(calculatePosition(i,j));	
			}
		}
		grid[2][2][0] = new BigRock();
		grid[2][2][0].setPos(calculatePosition(2,2));
	}
	
	public void generateBuildings() 
	{
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				Buildings building = (Buildings) Factory.create(0).produce();
				if(grid[i][j][0] instanceof BuildableIF) {
					BuildableIF object =(BuildableIF) grid[i][j][0];
					object.placeBuildings(grid, building);
				}				
			}	
		}
	}
	public void generateVehicle() {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < 5; j++) {
				ProducerIF vehicle = Factory.create(1);
				
				grid[i][j][2] = vehicle.produce();
				grid[i][j][2].setPos(calculatePosition(i,j));	
			}
		}
	}
	public ThunderstormIF getLightning(int i, int j) {
	    if(grid[i][j][1] instanceof ThunderstormIF && !(grid[i][j][1] instanceof LightningRod)) {
	        return (ThunderstormIF) grid[i][j][1];
	    }
	    if(grid[i][j][0] instanceof BigRock) {
	        return (ThunderstormIF) grid[i][j][0];
	    }
	    return null;
	}
	public void printGrid(Items[][][] fields) {
	    for(int i = 0; i < fields.length; i++) {
	        for(int j = 0; j < fields[i].length; j++) {
	        	
	        	// diesen Batzen hier würde ich jeweils als Methode auslagern. Wieso macht .getPos() das z.B. nicht direkt, beide Positionen holen und sie als string zurückgeben?
	            String position = String.valueOf(fields[i][j][0].getPos().getX())
	                            + fields[i][j][0].getPos().getY();
	            String property = fields[i][j][0].getClass().getSimpleName();
	            String building = fields[i][j][1] != null
	                            ? fields[i][j][1].getClass().getSimpleName()
	                            : "";
	            String vehicle = fields[i][j][2] != null
	                            ? fields[i][j][2].getClass().getSimpleName()
	                            : "kein Fahrzeug";

	            System.out.println(position + " | " + property + " | " + building + " | " + vehicle);
	        }
	    }
	}
	
}
