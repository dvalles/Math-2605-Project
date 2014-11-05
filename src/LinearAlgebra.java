/**
 * Linear Algebra Class that contains methods
 * for matrix * vector,
 * matrix + matrix,
 * vector . vector,
 * and vector + vector
 *
 * @author Ryan Brooks
 * @version 1.0
 */
public class LinearAlgebra {

    /**
     * Gets vector calculated by multiplying a matrix
     * by a vector. Matrix width must match vector
     * length.
     * @param m Matrix
     * @param v Vector
     * @return Vector calculated
     * @throws IllegalOperandException when length of
     * Vector and width of Matrix don't match.
     */
    public static Vector matrixVectorMultiply(Matrix m, Vector v)
        throws IllegalOperandException {
        int mHeight = m.getHeight();
        int mWidth = m.getWidth();
        if (v.getLength() != mWidth) {
            throw new IllegalOperandException("Can't calculate dot product of"
                + " a matrix of " + m.getWidth() + " width with a vector of"
                + " length " + v.getLength());
        }
        double[] arr = new double[mHeight];
        for (int i = 0; i < mHeight; i++) {
            for (int j = 0; j < mWidth; j++) {
                arr[i] += (m.get(i, j) * v.get(j));
            }
        }
        Vector vector = new Vector(arr);
        return vector;
    }

    /**
     * Gets Matrix calculated by adding two matrices.
     * @param m1 Matrix
     * @param m2 Matrix
     * @return Matrix calculated
     */
    public static Matrix matrixAdd(Matrix m1, Matrix m2)
        throws IllegalOperandException {
        int m1Height = m1.getHeight();
        int m1Width = m1.getWidth();
        double[][] matrixArr = new double[m1Height][m1Width];
        for (int i = 0; i < m1Height; i++) {
            for (int j = 0; j < m1Width; j++) {
                matrixArr[i][j] = m1.get(i, j) + m2.get(i, j);
            }
        }
        Matrix matrix = new Matrix(matrixArr);
        return matrix;
    }

    /**
     * Gets double that is calculated by the dot product
     * of two vectors
     * @param v1 Vector
     * @param v2 Vector
     * @return double calculated
     * @throws IllegalOperandException when length of
     * vector 1 and vector 2 don't match
     */
    public static double dotProduct(Vector v1, Vector v2)
        throws IllegalOperandException {
        if (v1.getLength() != v2.getLength()) {
            throw new IllegalOperandException("Can't calculate dot product of"
                + " a vector of length " + v1.getLength()
                + " with a vector of "
                + "length " + v2.getLength());
        } else {
            double dp = 0.0;
            for (int i = 0; i < v1.getLength(); i++) {
                dp += v1.get(i) * v2.get(i);
            }
            return dp;
        }
    }

    /**
     * Gets Vector calculated by adding two vectors.
     * @param v1 Vector
     * @param v2 Vector
     * @return Vector calculated
     */
    public static Vector vectorAdd(Vector v1, Vector v2)
        throws IllegalOperandException {
        int v1Length = v1.getLength();
        double[] vecArr = new double[v1Length];
        for (int i = 0; i < v1Length; i++) {
            vecArr[i] = v1.get(i) + v2.get(i);
        }
        Vector vector = new Vector(vecArr);
        return vector;
    }
}
