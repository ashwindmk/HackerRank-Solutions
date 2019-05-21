public class HourGlass {
    public static void main(String[] args) {
        // case 1: 19
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        // case 2: -6
        /*int[][] arr = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };*/
        int result = hourglassSum(arr);
        System.out.println(result);
    }

    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j];
                sum += arr[i][j+1];
                sum += arr[i][j+2];

                sum += arr[i+1][j+1];
                sum += arr[i+2][j];
                sum += arr[i+2][j+1];
                sum += arr[i+2][j+2];

                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
