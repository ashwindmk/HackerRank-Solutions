public class RepeatedString {
    public static void main(String[] args) {
        // case 1: 7
        /*String s = "aba";
        long n = 10;
        */

        // case 2: 1000000000000
        String s = "a";
        long n = 1000000000000L;

        System.out.println(repeatedString(s, n));
    }

    static long repeatedString(String s, long n) {
        int len = s.length();
        long count = 0;
        long extras = 0;
        long rem = n%len;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
                if (i < rem) {
                    extras++;
                }
            }
        }

        long times = n/len;
        count = (count * times) + extras;

        return count;
    }
}
