import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 6;
        System.out.println(Arrays.toString(rotLeft(a, d)));
    }

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int r = d % n;

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int p = (i + (n - r)) % n;
            b[p] = a[i];
        }
        return b;
    }
}
