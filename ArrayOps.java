public class ArrayOps {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        return largest;
    }

    public static int[] sumRows(int[][] matrix) {
        int[] out = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            out[row] = sum(matrix[row]);
        }
        return out;
    }

    public static int[] largestInRows(int[][] matrix) {
        int[] out = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            out[row] = largest(matrix[row]);
        }
        return out;
    }

    public static int sum(int[][] arr) {
        return sum(sumRows(arr));
    }

    public static int[] sumCols(int[][] matrix) {
        int[] out = new int[matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                out[col] += matrix[row][col];
            }
        }
        return out;
    }

    public static boolean isAllSame(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != first) return false;
        }
        return true;
    }

    public static boolean isRowMagic(int[][] matrix) {
        return isAllSame(sumRows(matrix));
    }

    public static boolean isColMagic(int[][] matrix) {
        return isAllSame(sumCols(matrix));
    }

    public static boolean isLocationMagic(int[][] matrix, int row, int col) {
        return sumRows(matrix)[row] == sumCols(matrix)[col];
    }
}
