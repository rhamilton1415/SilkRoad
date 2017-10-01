package geography;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public abstract class Tile
{
	private final Position tilePosition;
	private ArrayList<Path> paths = new ArrayList<Path>();
	public Tile(Position position)
	{
		tilePosition = position;
	}
	public Position getTilePosition(){return tilePosition;}
	public void addPath(Path p)
	{
		//Only add the path if we don't already have it
		//The path must also include this tile
		if(!hasPath(p) && p.includesTile(this))
		{
			paths.add(p);
		}
	}
	public ArrayList<Path> getPaths()
	{
		//Copy protected
		ArrayList<Path> p = new ArrayList<Path>();
		p = paths;
		return p;
	}
	/**
	 * @param p the path to be looked for in the Tile's path list
	 * @return true if this province has that path already
	 */
	public boolean hasPath(Path p)
	{
		return paths.contains(p);
	}
	/**
	 * @param t the tile to be looked for in this Tile's path list
	 * @return true if t can be pathed to from this province
	 */
	public boolean hasPath(Tile t)
	{
		return (getPath(t)==null);
	}
	/**
	 * @param to the tile to which this function looks for a path to
	 * @return the path to the given Tile if it exists or null if it doesn't
	 */
	public Path getPath(Tile to)
	{
		for (int i = 0; i<paths.size();i++)
		{
			if(paths.get(i).includesTile(to))
			{
				return paths.get(i);
			}
		}
		return null;
	}
	
}
