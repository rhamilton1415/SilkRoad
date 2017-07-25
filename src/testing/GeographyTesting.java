package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import geography.*;

public class GeographyTesting 
{
	@Test
	public void attackersPenaltyTest()
	{
		Province f = new Farmlands(new Position(1,1));
		assertEquals(f.getAttackersPenalty(),0);
		Province g = new Grasslands(new Position(1,2));
		assertEquals(g.getAttackersPenalty(),0);
		Province h = new Highlands(new Position(1,3));
		assertEquals(h.getAttackersPenalty(),1);
		Province hills = new Hills(new Position(1,4));
		assertEquals(hills.getAttackersPenalty(),1);
		Province m = new Mountains(new Position(1,5));
		assertEquals(m.getAttackersPenalty(),2);
		Province c = new Coastal(new Position(1,6));
		assertEquals(c.getAttackersPenalty(),0);
	}

}
