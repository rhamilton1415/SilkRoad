package geography;

public abstract class Province extends Tile 
{

	private int ruralPopulation;
	private int urbanPopulation;
	private int educatedPopulation;
	
	public Province(Position position) 
	{
		super(position);
	}
	public abstract int getAttackersPenalty();
	public int getRuralPopulation()
	{
		return ruralPopulation;
	}
	public int getUrbanPopulation()
	{
		return urbanPopulation;
	}
	public int getEducatedPopulation()
	{
		return educatedPopulation;
	}
	public int getTotalPopulation()
	{
		return getRuralPopulation()+getUrbanPopulation()+getEducatedPopulation();
	}

}
