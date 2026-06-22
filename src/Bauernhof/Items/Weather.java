package Bauernhof.Items;

import Bauernhof.factory.Map;

public class Weather {
	
	public  void simulateRain(Items[][][] fields) {
        for(int i = 0; i < fields.length; i++) {
            for(int j = 0; j < fields[i].length; j++) {
                if(fields[i][j][2] != null && fields[i][j][1] == null) {
                    Vehicle v = (Vehicle) fields[i][j][2];
                    String position = String.valueOf(fields[i][j][0].getPos().getX())
                                    + fields[i][j][0].getPos().getY();
                    v.setWet(true);
                    System.out.println(v.getClass().getSimpleName() + " auf " + position + " ist nass!");
                }
            }
        }
    }
	 public void simulateLightning(Items[][][] fields, Map map) {
	        boolean lightningHit = false;
	        while(!lightningHit) {
	            for(int i = 0; i < fields.length; i++) {
	                for(int j = 0; j < fields[i].length; j++) {
	                    ThunderstormIF target = map.getLightning(i, j);
	                    if(target != null && target.lightning()) {
	                        lightningHit = true;
	                        System.out.println(target.getClass().getSimpleName() + " wurde vom Blitz getroffen!");
	                    }
	                }
	            }
	        }
	    }

}
