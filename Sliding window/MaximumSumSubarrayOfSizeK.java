public static int maxSumSubarray(int[] arr, int k) {
    int n = arr.length;
    int sum = 0;

    // Sum first window
    for (int i = 0; i < k; i++) {
        sum += arr[i];
    }

    int maxSum = sum;

    // Slide window
    for (int i = k; i < n; i++) {
        sum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
}
