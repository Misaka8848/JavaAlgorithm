/**
 * Created by Administrator on 3/25/2018.
 * a binary search algorithm.
 */

package Chapter1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
public class BinarySearch {
    public static int rank(int k, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= 1) {
            int mid = (lo + hi) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
    return -1;
    }


    public static void main(String[] args) {
        int[] whitelist = In.readInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1) StdOut.println(key);
        }
    }
}

