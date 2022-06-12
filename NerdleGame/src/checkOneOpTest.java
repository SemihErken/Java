import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkOneOpTest {

	@Test
	void testTrue() {
		NewGamePage g = new NewGamePage();
		
		assertTrue(g.checkOneOp(82, 4 ,"*" , 328));
	}
	
	@Test
	void testFalse() {
		NewGamePage g = new NewGamePage();
		assertFalse(g.checkOneOp(84, 12, "/", 60));
	}

}
