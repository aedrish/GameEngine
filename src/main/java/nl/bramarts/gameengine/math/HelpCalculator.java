package nl.bramarts.gameengine.math;

public class HelpCalculator {
	
	public static float calculateThetaFromVector(Vector v) {
		Double theta = Math.atan((v.getY() / v.getX()));
		return theta.floatValue();
	}
	
	public static float calculatePhiFromVector(Vector v) {
		// tan -1 wortel ((x² + y²) / z)
		Double upperPart = Math.sqrt(v.getX() * v.getX() + v.getY()*v.getY());
		Double inputForInverseTangens = upperPart / v.getZ();
		Double phi = Math.atan(inputForInverseTangens);
		return phi.floatValue();
	}
	
	public static float radToDegrees(float rad) {
		Double degrees = rad * 180 / Math.PI;
		return degrees.floatValue();
	}
	
	public static float degreesToRad(float degrees) {
		Double radians = degrees * Math.PI / 180;
		return radians.floatValue();
	}
}
