import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        int[] test1 = {};
        int[] test2 = {1, 2, 3, 5};
        int[] test3 = {5, 2, 12, 10, 4};
        int[][] test4 = {test2, test3};

        System.out.println(ArrayOps.sum(test1)); // should be 0
        System.out.println(ArrayOps.sum(test2)); // should be 11
        System.out.println(ArrayOps.sum(test3)); // should be 33

        System.out.println(ArrayOps.largest(test2)); // should be 5
        System.out.println(ArrayOps.largest(test3)); // should be 12

        System.out.println(Arrays.toString(ArrayOps.sumRows(test4)));
        // should be [11, 33]

        System.out.println(Arrays.toString(ArrayOps.largestInRows(test4)));
        // should be [5, 12]

        System.out.println(ArrayOps.sum(test4)); // should be 44
    }
}
