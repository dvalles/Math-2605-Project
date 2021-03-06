/**
 * @author Ryan Brooks
 * @version 1.2
 */
public class Vector {

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
     */
    public double get(int i) {
        if (i > length) {
            //Vector Out of bounds, throws error
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