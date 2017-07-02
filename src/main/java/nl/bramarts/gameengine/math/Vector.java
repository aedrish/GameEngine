package nl.bramarts.gameengine.math;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vector {
	private float x;
	private float y;
	private float z;
	
	/**
	 * Method to add a vector to this vector
	 * @param v vector to add
	 */
	public void add(Vector v) {
		this.x = x + v.getX();
		this.y = y + v.getY();
		this.z = z + v.getZ();
	}

	/**
	 * Method to substract a vector from this vector
	 * @param v vector to substract
	 */	
	public void substract(Vector v) {
		this.x = x - v.getX();
		this.y = y - v.getY();
		this.z = z - v.getZ();
	}
	
	/**
	 * Method to scale the vector
	 * @param scale scaler to scale this vector
	 */
	public void scale(float scale) {
		this.x *= scale;
		this.y *= scale;
		this.z *= scale;
	}
	
	/**
	 * Method to calculate the magnitude/length of this vector
	 * @return the magnitude of the vector
	 */
	public float magnitude() {
		Double temp = Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
		return temp.floatValue();
	}
	
	/**
	 * Method to normalize the vector;
	 * also it generates a Unit vector
	 */
	public void normalize() {
		float magnitude = magnitude();
		this.x /= magnitude;
		this.y /= magnitude;
		this.z /= magnitude;
	}
	
	/**
	 * method to multiple the vector by another vector
	 * @param vector the vector to multiply this vector with
	 * @return the scaler
	 */
	public float dotVector(Vector vector){
		Vector temp = new Vector();
		temp.setX(this.x * vector.getX());
		temp.setY(this.y * vector.getY());
		temp.setZ(this.z * vector.getZ());
		return (temp.getX() + temp.getY() + temp.getZ());
	}
	
	/**
	 * The Cross Product a × b of two vectors is another vector that is at right angles to both
	 * @param vector the vector to cross this vector with
	 * @return the resulting vector
	 */
	public Vector crossVector(Vector vector) {
		Vector temp = new Vector();
		temp.setX(this.y * vector.getZ() - this.z * vector.getY());
	    temp.setY(this.z * vector.getX() - this.x * vector.getZ());
		temp.setZ(this.x * vector.getY() - this.y * vector.getX());
		return temp;
	}
}
