/**
 * Immutable abstraction of Matrix.
 *
 * @author Michael Maurer
 * @version 1.2
 */
public class Matrix {

    /*
    Create final instance variables
    */
    private final double[][] mat;
    private final int height;
    private final int width;


    /**
     * Initialize instance variables
     * @param matrix 2D array representation of Matrix
     */
    public Matrix(double[][] matrix) {
        this.mat = matrix;
        this.height = mat.length;
        this.width = mat[0].length;
    }

    /**
     * Gets value located at specified row and column
     * @param i row
     * @param j column
     * @return double located at row i and column j in matrix
     */
    public double get(int i, int j) {
        if (i > height || j > width) {
            //Matrix out of bounds, throw error
        }
        return mat[i][j];
    }

    /**
     * Get's the height of the matrix.
     * @return number of rows in matrix
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Get's the width of the matrix.
     * @return number of columns in matrix
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Gets String representation of matrix.
     * Columns separated by tabs, rows by new lines.
     * @return String representation of matrix.
     */
    public String toString() {
        String matrixString = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrixString = matrixString + "    " + mat[i][j];
            }
            matrixString = matrixString + "\n";
        }

        return matrixString;
    }
}