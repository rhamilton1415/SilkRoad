package geography;

public final class Mountains extends Province {

	private static final int attackersPenalty = 2;
	public Mountains(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getAttackersPenalty() 
	{
		return attackersPenalty;
	}

}
