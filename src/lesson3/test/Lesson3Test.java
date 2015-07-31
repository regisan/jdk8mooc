package lesson3.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import lesson3.Lesson3;

import org.junit.Test;

public class Lesson3Test {
	
	private final List<String> wordList = Arrays.asList("brightness", "habena", "ovatocylindraceous");
	private int[][] matrix = new int[][] {{0, 8, 15}, {8, 0, 15}, {15, 15, 0}};

	@Test
	public void test() {
		assertArrayEquals("yep", matrix, Lesson3.computeLevenshtein(wordList, false));
	}

}
