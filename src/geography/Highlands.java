package geography;

public final class Highlands extends Province {

	private static final int attackersPenalty = 1;
	public Highlands(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getAttackersPenalty() 
	{
		return attackersPenalty;
	}

}
