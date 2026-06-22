package Bauernhof.factory;

public abstract class Factory implements ProducerIF
{
	public static ProducerIF create(int art) 
	{
		switch(art) 
		{
	
		case 0: return new constructionGuild();
		case 1: return new AgriculturalMachines();
		case 2: return new agriculturalAssociation();
		default:throw new IllegalArgumentException("Unbekannt");
		}
	}
}
