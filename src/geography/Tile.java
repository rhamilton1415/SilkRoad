package geography;

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
		//TODO sanitise
		paths.add(p);
	}
	public ArrayList<Path> getPaths()
	{
		//Copy protected
		ArrayList<Path> p = new ArrayList<Path>();
		p = paths;
		return p;
	}
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
