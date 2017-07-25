package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import geography.*;

public class GeographyTesting 
{
	Province f = new Farmlands(new Position(1,1));
	Province g = new Grasslands(new Position(1,2));
	Province h = new Highlands(new Position(1,3));
	Province hills = new Hills(new Position(1,4));
	Province m = new Mountains(new Position(1,5));
	Province c = new Coastal(new Position(1,6));
	
	@Test
	public void attackersPenaltyTest()
	{
		assertEquals(f.getAttackersPenalty(),0);
		assertEquals(g.getAttackersPenalty(),0);
		assertEquals(h.getAttackersPenalty(),1);
		assertEquals(hills.getAttackersPenalty(),1);
		assertEquals(m.getAttackersPenalty(),2);
		assertEquals(c.getAttackersPenalty(),0);
	}
	
	@Test
	public void inheritanceVerificationTest()
	{
		Province[] map = new Province[] {f,g,h,hills,m,c};
		assertEquals(map[0].getAttackersPenalty(),0);
		assertEquals(map[1].getAttackersPenalty(),0);
		assertEquals(map[2].getAttackersPenalty(),1);
		assertEquals(map[3].getAttackersPenalty(),1);
		assertEquals(map[4].getAttackersPenalty(),2);
		assertEquals(map[5].getAttackersPenalty(),0);
	}

}
