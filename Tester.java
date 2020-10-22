import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        int[] test1 = {};
        int[] test2 = {1, 2, 3, 5};
        int[] test3 = {5, 2, 12, 10, 4};
        int[][] test4 = {test2, test3};
        int[][] A = {
            {1, 0, 12, -1},
            {7, -2, 2, 1},
            {-5, -2, 2, -9}
        };
        int[] B = {1, 3, 5};
        int[][] C = {
            {1, 2, 3, 4},
            {2, 3, 4, 1},
            {3, 4, 1, 2}
        };
        int[][] D = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        int[][] E = {
            {2, 2, 2},
            {2, 2, 2}
        };

        System.out.println("4a:");
        System.out.println(ArrayOps.sum(test1)); // should be 0
        System.out.println(ArrayOps.sum(test2)); // should be 11
        System.out.println(ArrayOps.sum(test3)); // should be 33
        System.out.println(ArrayOps.sum(B)); // should be 9
        System.out.println();

        System.out.println("4b:");
        System.out.println(ArrayOps.largest(test2)); // should be 5
        System.out.println(ArrayOps.largest(test3)); // should be 12
        System.out.println();

        System.out.println("4c:");
        System.out.println(Arrays.toString(ArrayOps.sumRows(test4)));
        // should be [11, 33]
        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        // should be [12, 8, -14]
        System.out.println();

        System.out.println("4d:");
        System.out.println(Arrays.toString(ArrayOps.largestInRows(test4)));
        // should be [5, 12]
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        // should be [12, 7, 2]
        System.out.println();

        System.out.println("4e:");
        System.out.println(ArrayOps.sum(test4)); // should be 44
        System.out.println(ArrayOps.sum(A)); // should be 6
        System.out.println();
        
        System.out.println("5a:");
        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
        // should be [3, -4, 16, -9]
        System.out.println();

        System.out.println("5b:");
        System.out.println(ArrayOps.isRowMagic(C));
        // should be true
        System.out.println(ArrayOps.isRowMagic(D));
        // should be false
    }
}
