import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 1;
        System.out.println(Arrays.toString(rotRight(a, d)));
    }

    private static int[] rotRight(int[] a, int d) {
        int n = a.length;
        int r = d % n;

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            int p = (i + (n + r)) % n;
            b[p] = a[i];
        }

        return b;
    }
}
