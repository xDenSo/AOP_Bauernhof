package Bauernhof.Items;

public abstract class Property extends Items
{
	
	private static int nextid = 1000;
	
	public Property() 
	{
		this.setId(nextid++);
		
	}
	
	
}
