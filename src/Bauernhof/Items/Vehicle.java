package Bauernhof.Items;

public abstract class Vehicle extends Items implements RainIF
{
	private static int nextid = 8000;
	
	private boolean wet = false;
	
	public Vehicle() 
	{
		this.setId(nextid++);	
	}
	
	public void setWet(boolean wet) {
		this.wet = wet;
	}
	
	public boolean isWet() {
		return wet;
	}
}
