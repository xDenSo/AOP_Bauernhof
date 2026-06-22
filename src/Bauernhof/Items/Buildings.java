package Bauernhof.Items;

import java.util.Random;

public abstract class Buildings extends Items implements ThunderstormIF
{
	protected static int nextid = 5000;

	Random rando = new Random();

	private boolean lightningHit;
	
	public Buildings() 
	{
		this.setId(nextid++);
	}

	public static int getNextid() {
		return nextid;
	}

	public static int setNextid(int nextid) {
		Buildings.nextid = nextid;
		return nextid;
	}

	public boolean isLightningHit() {
		return lightningHit;
	}

	public void setLightningHit(boolean lightningHit) {
		this.lightningHit = lightningHit;
	}

	@Override
	public boolean lightning() {
	    return rando.nextDouble() < 0.05;
	}


	
	
	
	
	
}
