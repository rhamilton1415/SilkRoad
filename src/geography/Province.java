package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public abstract class Province extends Tile 
{

	private int ruralPopulation;
	private int urbanPopulation;
	private int educatedPopulation;
	
	/**
	 * Province is the superclass for all land-based provinces.
	 * <p>
	 * Subclass of Tile - combined with the sibling class SeaProvince a complete map can be created
	 * @param  position The Position of the province.
	 */
	public Province(Position position) 
	{
		super(position);
	}
	
	/**
	 * Returns the penalty an attacking force will face in a battle
	 * @return the penalty as an integer value
	 */
	public abstract int getAttackersPenalty();
	
	/**
	 * Returns the Rural population of this province as an Integer
	 * @return The Rural Population as an Integer
	 */
	public int getRuralPopulation()
	{
		return ruralPopulation;
	}
	
	/**
	 * Returns the Urban population of this province as an Integer
	 * @return The Urban Population as an Integer
	 */
	public int getUrbanPopulation()
	{
		return urbanPopulation;
	}
	
	/**
	 * Returns the Educated population of this province as an Integer
	 * @return The Educated Population as an Integer
	 */
	public int getEducatedPopulation()
	{
		return educatedPopulation;
	}
	
	/**
	 * Returns the total (Rural + Urban + Educated) population of this province as an Integer
	 * @return The total Population as an Integer
	 */
	public int getTotalPopulation()
	{
		return getRuralPopulation()+getUrbanPopulation()+getEducatedPopulation();
	}

}
