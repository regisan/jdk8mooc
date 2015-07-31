package lesson3.test;

import static org.junit.Assert.assertEquals;
import lesson3.Levenshtein;

import org.junit.Test;

public class LevenshteinTest {
	
	@Test
	public void lev() {
		assertEquals(8, Levenshtein.lev("brightness", "habena"));
		assertEquals(15, Levenshtein.lev("brightness", "ovatocylindraceous"));
		assertEquals(15, Levenshtein.lev("habena", "ovatocylindraceous"));
	}
	
	@Test
	public void levInvertido() {
		assertEquals(8, Levenshtein.lev("habena", "brightness"));
		assertEquals(15, Levenshtein.lev("ovatocylindraceous", "brightness"));
		assertEquals(15, Levenshtein.lev("ovatocylindraceous", "habena"));
	}

	@Test
	public void levIgual() {
		assertEquals(0, Levenshtein.lev("brightness", "brightness"));
		assertEquals(0, Levenshtein.lev("ovatocylindraceous", "ovatocylindraceous"));
		assertEquals(0, Levenshtein.lev("habena", "habena"));
	}
}
