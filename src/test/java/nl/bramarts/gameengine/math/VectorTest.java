package nl.bramarts.gameengine.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VectorTest {

	private Vector v;
	
	@Before
	public void setup() {
		v = new Vector(5, 3, 7);
	}
	
	@Test
	public void testAddVector() {
		v.add(new Vector(1, 2, 3));
		assertEquals(6, v.getX(), 0.001);
		assertEquals(5, v.getY(), 0.001);
		assertEquals(10, v.getZ(), 0.001);
	}
	
	@Test
	public void testSubtract() {
		v.substract(new Vector(1, 2 ,3));
		assertEquals(4, v.getX(), 0.001);
		assertEquals(1, v.getY(), 0.001);
		assertEquals(4, v.getZ(), 0.001);
	}
	
	@Test
	public void testScale() {
		v.scale(2);
		assertEquals(10, v.getX(), 0.001);
		assertEquals(6, v.getY(), 0.001);
		assertEquals(14, v.getZ(), 0.001);
	}
	
	@Test
	public void testMagnitude() {
		Vector vector = new Vector(2, 4, 4);
		float expected = 6;
		assertEquals(expected, vector.magnitude(), 0.001);
	}
	
	@Test
	public void testNormalize() {
		Vector vector = new Vector(2, 4, 4);
		float expectedX = 1f / 3f;
		float expectedY = 2f / 3f; 
		float expectedZ = 2f / 3f; 
		vector.normalize();
		assertEquals(expectedX, vector.getX(), 0.001);
		assertEquals(expectedY, vector.getY(), 0.001);
		assertEquals(expectedZ, vector.getZ(), 0.001);
	}
	
	@Test
	public void testDotProduct() {
		Vector vector = new Vector(2,3,4);
		Vector vectorToMultiply = new Vector(3,4,5);
		float expectedResult = 38;
		float result = vector.dotVector(vectorToMultiply);
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Test
	public void testCrossProduct() {
		Vector vectorA = new Vector(2, 3, 4);
		Vector vectorB = new Vector(5, 6, 7);
		Vector expected = new Vector(-3, 6, -3);
		Vector actually = vectorA.crossVector(vectorB);
		assertEquals(expected, actually);
	}
}
