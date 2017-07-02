package nl.bramarts.gameengine.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelpCalculatorTest {

	@Test
	public void testcalculateThetaFromVector() {
		Vector vector = new Vector(3, 4, 5);
		float expectedTheta = 53.1301F;
		float actualTheta = HelpCalculator.calculateThetaFromVector(vector);
		assertEquals(expectedTheta, HelpCalculator.radToDegrees(actualTheta), 0.001);

	}
	
	@Test
	public void testcalculatePhiFromVector() {
		Vector vector = new Vector(3, 4, 5);
		float expectedPhi = 45;
		float actualPhi = HelpCalculator.calculatePhiFromVector(vector);
		assertEquals(expectedPhi, HelpCalculator.radToDegrees(actualPhi), 0.001);

	}
	
	@Test
	public void testRadToDegrees() {
		float expected = 57.29577F;
		float actual = HelpCalculator.radToDegrees(1);
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testDegreesToRad() {
		float expected = 0.5236F;
		float actual = HelpCalculator.degreesToRad(30);
		assertEquals(expected, actual, 0.001);
	}
}
