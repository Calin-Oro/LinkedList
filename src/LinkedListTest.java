import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void linkedListTest() {
		LinkedList<Integer> test = new LinkedList<Integer>();
		
		assertEquals(test.isEmpty(), true);
		assertEquals(test.size(), 0);
		test.add(500);
		assertEquals(test.isEmpty(), false);
		assertEquals(test.size(), 1);
		test.add(5);
		assertEquals(test.size(), 2);
		assertEquals(test.contains(5), true);
		assertEquals(test.contains(4), false);
		//assertEquals(test.indexOf(500), 1);
		//assertEquals(test.indexOf(5), 2);
		test.clear();
		assertEquals(test.isEmpty(), true);
		assertEquals(test.size(), 0);
		
	}

}
