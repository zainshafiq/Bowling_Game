package ense475;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestGame2 {

	//@Test
	void testRoll() {
		fail("Not yet implemented");
	}

	//@Test
	void testScore() {
		fail("Not yet implemented");
	}
	
	//@Test
	void test() {
		fail("Not yet implemented");
	}
		
	private Game g;
		
	@Test
	protected void setUp() throws Exception {
		g = new Game();
	}
		
		
	@Test
	private void rollMany(int n, int pins) {
		for(int i = 0; i < n; i++)
			g.roll(pins);
	}
	
	@Test
	public void testGutterGame() throws Exception {
		rollMany(20, 0);
		assertEquals(0, g.score());
	}	
	
	@Test	
	public void testAllOnes() throws Exception {
		rollMany(20, 1);
		assertEquals(20, g.score());
	}
	
	@Test 
	private void rollSpare() {
		g.roll(5);
		g.roll(5);
	}
	
	@Test
	public void testOneSpare() throws Exception {
		rollSpare();
		g.roll(3);
		rollMany(17, 0);
		assertEquals(16, g.score());
	}
	
	@Test
	public void testOneStrike() throws Exception {
		g.roll(10);
		g.roll(3);
		g.roll(4);
		rollMany(16, 0);
		assertEquals(24, g.score());
	}
		
}
