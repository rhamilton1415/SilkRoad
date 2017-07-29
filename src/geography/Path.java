package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public final class Path {
	private final Tile from;
	private final Tile to;
	private boolean passable = true;
	/**
	 * This class represents the path between two adjacent entities for the purposes of an A* algorithm
	 * <p>
	 * This class will contain the two positions the path will be connecting and the cost/travel time between them
	 * @param  tileFrom The first position
	 * @param  tileTo The second position
	 */
	public Path(Tile tileFrom, Tile tileTo) 
	{
		from = tileFrom;
		to = tileTo;
	}
	public double getPathCost()
	{
		return Position.getDistance(from.getTilePosition(), to.getTilePosition());
	}
	public boolean isLandRoute()
	{
		return(from.getClass() == Province.class && to.getClass() == Province.class);
	}
	public boolean isLandToWaterRoute()
	{
		return((from.getClass() == Province.class && to.getClass() == SeaProvince.class)||(from.getClass() == SeaProvince.class && to.getClass() == Province.class));
	}
	public boolean isSeaRoute()
	{
		return(from.getClass() == SeaProvince.class && to.getClass() == SeaProvince.class);
	}
	public void setPassable(boolean isPassable)
	{
		passable = isPassable;
	}
	public boolean isPassable()
	{
		return passable;
	}
	public boolean includesTile(Tile t)
	{
		return (from == t || to == t);
	}
	public Tile getDestination(Tile t)
	{
		if(from == t)
		{
			return to;
		}
		else if(to == t)
		{
			return from;
		}
		else
		{
			return null;
		}
	}

}
