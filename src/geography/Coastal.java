package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public final class Coastal extends Province {

	private static final int attackersPenalty = 0;
	public Coastal(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getAttackersPenalty() 
	{
		return attackersPenalty;
	}

}
