package hackerrank;

import java.util.HashMap;

// This solution uses HashSet which will take up less space.
public class SockMerchantSet {
    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int r = sockMerchant(n, ar);
        System.out.println(r);
    }

    private static int sockMerchant(int n, int[] ar) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int item = ar[i];
            if (set.contains(item)) {
                set.remove(item);
                result++;
            } else {
                set.add(item);
            }
        }

        return result;
    }
}
