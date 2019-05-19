public class JumpingOnClouds {
    public static void main(String[] args) {
        //int[] c = {0, 0, 0, 0, 1, 0};  // 3
        int[] c = {0, 0, 1, 0, 0, 1, 0};  // 4
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int pos = 0;
        int n = c.length;
        while (pos < n) {
            if (pos + 2 < n && c[pos + 2] == 0) {
                pos = pos + 2;
                jumps++;
            } else if (pos + 1 < n && c[pos + 1] == 0) {
                pos = pos + 1;
                jumps++;
            } else {
                pos = pos + 1;
            }
        }

        return jumps;
    }
}
