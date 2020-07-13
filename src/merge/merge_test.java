package merge;

import static org.junit.Assert.*;

import org.junit.Test;

public class merge_test {
	@Test
	public void test() {
		int[] actual = { 5, 1, 6, 2, 3, 4 };
	    int[] expected = { 1, 2, 3, 4, 5, 6 };
	    merge_sort.mergeSort(actual);
	    assertArrayEquals(expected, actual);
	}

}
