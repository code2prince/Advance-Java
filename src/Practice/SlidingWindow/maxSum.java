package Practice.SlidingWindow;

public class maxSum {
    public static int maxSumCalculate(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] arg) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("maxSum is:" + maxSumCalculate(arr, k));
    }
}
