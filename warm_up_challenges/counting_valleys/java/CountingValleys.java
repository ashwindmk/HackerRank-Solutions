public class CountingValleys {
    public static void main(String[] args) {
        String s = "UUDDDDUUDDUUUUDDDDUU";  // output: 3
        int n = s.length();
        int valleyCount = countingValleys(n, s);
        System.out.println(valleyCount);
    }

    static int countingValleys(int n, String s) {
        int level = 0;
        int valleyCount = 0;
        boolean isValley = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                level++;
            } else if (s.charAt(i) == 'D') {
                level--;
            }

            if (level < 0) {
                if (!isValley) {
                    isValley = true;
                    valleyCount++;
                }
            } else {
                if (isValley) {
                    isValley = false;
                }
            }
        }

        return valleyCount;
    }
}
