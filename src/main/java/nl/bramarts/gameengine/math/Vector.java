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
	
	public void add(Vector v) {
		this.x = x + v.getX();
		this.y = y + v.getY();
		this.z = z + v.getZ();
	}
	
	public void substract(Vector v) {
		this.x = x - v.getX();
		this.y = y - v.getY();
		this.z = z - v.getZ();
	}
	
	public void scale(float scale) {
		this.x *= scale;
		this.y *= scale;
		this.z *= scale;
	}
	
	public float magnitude() {
		Double temp = Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
		return temp.floatValue();
	}
	
	public void normalize() {
		float magnitude = magnitude();
		this.x /= magnitude;
		this.y /= magnitude;
		this.z /= magnitude;
	}	
}
