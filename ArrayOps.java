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
}
