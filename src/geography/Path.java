package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public final class Path {
	private final Tile from;
	private final Tile to;
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

}
