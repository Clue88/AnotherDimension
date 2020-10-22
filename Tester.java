import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        int[] test1 = {};
        int[] test2 = {1, 2, 3, 5};
        int[] test3 = {5, 2, 12, 10, 4};
        int[][] test4 = {test2, test3};

        System.out.println(ArrayOps.sum(test1));
        System.out.println(ArrayOps.sum(test2));
        System.out.println(ArrayOps.sum(test3));
        System.out.println(ArrayOps.largest(test2));
        System.out.println(ArrayOps.largest(test3));
        System.out.println(Arrays.toString(ArrayOps.sumRows(test4)));
    }
}
