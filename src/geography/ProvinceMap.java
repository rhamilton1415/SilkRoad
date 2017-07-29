package geography;

public final class ProvinceMap 
{
	public static void addPath(Province from, Province to)
	{
		Path p = new Path(from,to);
		from.addPath(p);
		to.addPath(p);
	}
}
