import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GenerateEquationLengthTest {

	@Test
	void testLength() {
		generate g = new generate();
		
		assertTrue(g.generateEquations().length() < 10 & g.generateEquations().length() > 6);
	}

	
	@Test
	void testType() {
		
		generate g = new generate();
		
		assertEquals(String.class,g.generateEquations().getClass());
	}
	
	@Test
	void testIsFirstCharEqualSymbol() {
		
		generate g = new generate();
		
		assertFalse(g.generateEquations().charAt(0) == '=');
	}
	
	@Test
	void testIsNotLastCharOperatorSymbol() {
		
		generate g = new generate();
		
		assertFalse(g.generateEquations().charAt(g.generateEquations().length()-1) == '+' || g.generateEquations().charAt(g.generateEquations().length()-1) == '-' || g.generateEquations().charAt(g.generateEquations().length()-1) == '*' || g.generateEquations().charAt(g.generateEquations().length()-1) == '/');
	}
	
	
	
}
