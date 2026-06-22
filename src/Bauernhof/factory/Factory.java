package Bauernhof.factory;

public abstract class Factory implements ProducerIF
{
	public static ProducerIF create(int art) 
	{
		// du kannst den switch case hier umgehen, indem du für jeden Case jeweils 1 Methode implemntierst, zb create0(), create1() und create2() und dann die entsprechende aufrufen, anstatt den Case als Argument mitzugeben
		switch(art) 
		{
	
		case 0: return new constructionGuild();
		case 1: return new AgriculturalMachines();
		case 2: return new agriculturalAssociation();
		default:throw new IllegalArgumentException("Unbekannt");
		}
	}
}
