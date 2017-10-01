package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.SwingUtilities;

import org.junit.Test;

import geography.*;
import rendering.DisplayFrame;

public class GeographyTesting 
{
	Province f = new Farmlands(new Position(1,1));
	Province g = new Grasslands(new Position(1,2));
	Province h = new Highlands(new Position(1,3));
	Province hills = new Hills(new Position(1,4));
	Province m = new Mountains(new Position(1,5));
	Province c = new Coastal(new Position(1,6));
	
	//functionality tests
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
	
	@Test
	public void PathCreationTest()
	{
		Path.createPath(f, g);
		assertNotNull(f.getPath(g));
		assertNotNull(g.getPath(f));
		assertEquals(f.getPath(g).getPathCost(), 1.0, 0.1);

		assertTrue(f.getPath(g).isPassable());
		assertTrue(g.getPath(f).isPassable());
		f.getPath(g).setPassable(false);
		assertFalse(f.getPath(g).isPassable());
		assertFalse(g.getPath(f).isPassable());
		Path.createPath(f, g); //shouldn't do anything
		assertFalse(f.getPaths().size()==2);
	}
	
	@Test
	public void AStarAlgorithmPathingTest()
	{
	}

}
