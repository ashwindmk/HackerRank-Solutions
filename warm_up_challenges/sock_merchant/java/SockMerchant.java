package hackerrank;

import java.util.HashMap;

/**
 * Count number of pairs in given array
 *
 * input:
 * n = 7
 * ar = [1, 2, 1, 2, 1, 3, 2]
 *
 * output:
 * 2
 */

public class SockMerchant {
    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int r = sockMerchant(n, ar);
        System.out.println(r);
    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int item = ar[i];
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        int result = 0;
        for (int key : map.keySet()) {
            result = result + (map.get(key) / 2);
        }

        return result;
    }
}
