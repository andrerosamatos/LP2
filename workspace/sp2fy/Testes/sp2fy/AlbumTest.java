package sp2fy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class AlbumTest {
	
	private Album mariliaMendDVD;
	
	@Before
	public void setUp() throws Exception {
		mariliaMendDVD = new Album("Marilia Mendonca", "Marilia Mendonca- Audio DVD", 2015);
	}
	
	@Test
	public void testArtistaNull() throws Exception{
		Album alb = new Album(null, "AoVivo", 2012);
	}
	
	@Test
	public void testArtistaVazio() throws Exception{
		Album alb = new Album("", "AoVivo", 2012);
	}
	
	
	
	
	
	
	
/*
 * 	@Test
 
	public void testAlbum() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}
*/
}
