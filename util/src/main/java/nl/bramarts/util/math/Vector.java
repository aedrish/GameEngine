package nl.bramarts.util.math;

public class Vector {
    private float x;
    private float y;
    private float z;

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {

    }

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
     * The Cross Product a x b of two vectors is another vector that is at right angles to both
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


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (Float.compare(vector.x, x) != 0) return false;
        if (Float.compare(vector.y, y) != 0) return false;
        return Float.compare(vector.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        result = 31 * result + (z != +0.0f ? Float.floatToIntBits(z) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
