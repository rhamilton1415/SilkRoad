package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public abstract class Tile 
{
	private final Position tilePosition;
	public Tile(Position position)
	{
		tilePosition = position;
	}
	public Position getTilePosition(){return tilePosition;}
}
