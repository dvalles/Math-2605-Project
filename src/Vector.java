/**
 * Immutable abstraction for Vector
 *
 * @author Michael Maurer
 * @version 1.2
 */
public class Vector {

    /*
    Create final instance variables
    */
    private final double[] vec;
    private final int length;

    /**
     * Initialize instance variables
     * @param vector array representation of vector
     */
    public Vector(double[] vector) {
        this.vec = vector;
        this.length = vector.length;
    }

    /**
     * Gets value located at specified index
     * @param i index in vector
     * @return double located at index 'i' in vector
     * @throws VectorIndexOutOfBoundsException when
     * index is outside length of Vector.
     */
    public double get(int i) {
        if (i > length) {
            throw new VectorIndexOutOfBoundsException("Point does not"
                + "exist in Vector.");
        }
        return vec[i];
    }

    /**
     * Get's the length of the Vector.
     * @return number of components in vector
     */
    public int getLength() {
        return this.length;
    }

    /**
     * String representation of vector with components
     * separated by tabs
     * @return String representation of vector
     */
    public String toString() {
        String vectorString = "";

        for (int i = 0; i < length; i++) {
            vectorString = vectorString + "    " + vec[i];
        }

        return vectorString;
    }
}