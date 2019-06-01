public class MinimumSwaps2 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};  // 5
        //int[] arr = {1, 3, 5, 2, 4, 6, 7};  // 3
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int observedElement = arr[i];
            int expectedElement = i + 1;
            if (observedElement != expectedElement) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == expectedElement) {
                        int t = arr[j];
                        arr[j] = observedElement;
                        arr[i] = t;
                        swaps++;
                        break;
                    }
                }
            }
        }

        return swaps;
    }
}
