package geography;

public abstract class Tile 
{
	private final Position tilePosition;
	public Tile(Position position)
	{
		tilePosition = position;
	}
	public Position getTilePosition(){return tilePosition;}
	
}
