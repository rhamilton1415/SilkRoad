package geography;

public final class TileMesh {

	private final Position[] corners;
	/**
	 * TileMesh defines the dimensions of the Tile.
	 * <p>
	 * The extent of a tile in every direction is determined by an array of clockwise Positions with straight lines between them.
	 * <p>
	 * From this both a rendering of the map can be created and path costs can be more precicely defined
	 * @param  tileCorners An array of Positions which defines the corners of this province
	 */
	public TileMesh(Position[] tileCorners) 
	{
		corners = tileCorners;
	}

}
