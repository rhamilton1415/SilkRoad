package geography;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public final class Path implements Drawable{
	private final Tile from;
	private final Tile to;
	private boolean passable = true;
	private static ArrayList<Path> worldPaths = new ArrayList<Path>();
	/**
	 * This class represents the path between two adjacent entities for the purposes of an A* algorithm
	 * <p>
	 * This class will contain the two positions the path will be connecting and the cost/travel time between them
	 * @param  tileFrom The first position
	 * @param  tileTo The second position
	 */
	public static void createPath(Tile tileFrom, Tile tileTo)
	{
		if(tileFrom != tileTo) //You can't path to the same province
		{
			if(tileFrom.hasPath(tileTo)) //If the path does not already exist
			{
				Path p = new Path(tileFrom,tileTo);
				//Both tiles must have the path added to
				tileFrom.addPath(p);
				tileTo.addPath(p);
				worldPaths.add(p);
			}
		}
	}
	public static ArrayList<Path> getWorldPaths()
	{
		ArrayList<Path> p = worldPaths;
		return p;
	}
	private Path(Tile tileFrom, Tile tileTo) 
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
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		if(!Path.class.isAssignableFrom(obj.getClass()))
		{
			return false;
		}
		final Path p = (Path) obj;
		if(p.getDestination(to) == from || p.getDestination(from) == to) //If the two provinces this path connects are the same as the given object, they are the same
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public int hashCode()
	{
		int hash = 3;
		hash = 53 * hash + (this.from.hashCode() + this.to.hashCode());
		return hash;
	}
	@Override
	public void draw(Graphics g) 
	{
		g.drawLine(to.getTilePosition().getXCoordinate(), to.getTilePosition().getYCoordinate(), from.getTilePosition().getXCoordinate(), from.getTilePosition().getYCoordinate());
	}
}
