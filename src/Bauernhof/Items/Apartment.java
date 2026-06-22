package Bauernhof.Items;

public class Apartment extends Buildings implements LightningRod
{
	
	public Apartment() 
	{}

	@Override
	public boolean hasLightningRod() {
		return true;
	}
}
