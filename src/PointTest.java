import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	@Test
	public void testPoint() {
		Point p = new Point();
		
		int expected = 0;
		int actual = p.getX();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPointPoint() {
	}
	
	@Test
	public void testPointIntInt() {
		Point p = new Point(0, 0);
		
		int expected = 0;
		int actual = p.getX();
		
		assertEquals(expected, actual);
	}

}
