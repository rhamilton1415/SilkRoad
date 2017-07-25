package geography;

public final class Farmlands extends Province 
{
	
	private static final int attackersPenalty = 0;
	public Farmlands(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getAttackersPenalty() 
	{
		return attackersPenalty;
	}

}
