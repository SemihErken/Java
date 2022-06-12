import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkTwoOpTest {

	@Test
	void testTrue() {
		NewGamePage g = new NewGamePage();
		
		assertTrue(g.checkTwoOp(10, 5, 5, "*", "+", 55));
	}
	
	@Test
	void testFalse() {
		NewGamePage g = new NewGamePage();
		assertFalse(g.checkTwoOp(10, 5, 5, "*", "+", 60));
	}

}
