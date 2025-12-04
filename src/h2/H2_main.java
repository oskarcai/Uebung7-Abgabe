package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int[] testArray1 = {2,7,1,9};
        int[] testArray2 = {5,6,7};
        System.out.println( Arrays.toString(change(testArray1, testArray2, 2, 4)) );
        System.out.println( Arrays.toString(change(testArray1, testArray1, 2, 4)) );
        System.out.println( Arrays.toString(change(testArray1, testArray1, 3, 2)) );
    }

    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end > start) {

            if (Arrays.compare(a, b) != 0) {    // also ungleicher Inhalt
                return Arrays.copyOfRange(a, 0, a.length);
             // return Arrays.copOf(a, a.length); auch möglich

            } else {    // if(Arrays.compare(a, b) == 0) {}, also gleicher Inhalt
                Arrays.sort(a);
                return Arrays.copyOfRange(a, start, end);
            }

        } else {    // if(end <= start) {}
            return new int[0];
        }
    }
}