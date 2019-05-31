public class NewYearChaos {
    public static void main(String[] args) {
        int[] q = {1, 2, 3, 4, 5, 8, 6, 7};
        minimumBribes(q);
    }

    static void minimumBribes(int[] q) {
        int n = q.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int e = q[i];

            if (e > (i + 3)) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, e - 2); j < i; j++) {
                if (q[j] > e) {
                    swaps++;
                }
            }
        }

        System.out.println(swaps);
    }
}
