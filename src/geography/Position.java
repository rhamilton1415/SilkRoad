package geography;
/**
 * @author      Robert Hamilton
 * @version     1.0
 * @since       1.0
 */
public final class Position 
{
	private int xCoord;
	private int yCoord;
	//TODO does this need to be positive?
	public Position(int x, int y)
	{
		xCoord = x;
		yCoord = y;
	}
	public void setXCoordinate(int x)
	{
		xCoord = x;
	}
	public void setYCoordinate(int y)
	{
		yCoord = y;
	}
	public int getXCoordinate(){return xCoord;}
	public int getYCoordinate(){return yCoord;}
	static public double getDistance(Position from, Position to)
	{
		int xDistance = from.getXCoordinate() - to.getXCoordinate();
		int yDistance = from.getYCoordinate() - to.getYCoordinate();
		return (Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2)));
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		if(!Position.class.isAssignableFrom(obj.getClass()))
		{
			return false;
		}
		final Position p = (Position) obj;
		if((p.getXCoordinate() == this.getXCoordinate())&&(p.getYCoordinate()==this.getYCoordinate()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public int hashCode()
	{
		int hash = 3;
		hash = 53 * hash + this.getXCoordinate();
		hash = 53 * hash + this.getYCoordinate();
		return hash;
	}
}
