package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public final class Grasslands extends Province {

	private static final int attackersPenalty = 0;
	public Grasslands(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getAttackersPenalty() 
	{
		return attackersPenalty;
	}

}
