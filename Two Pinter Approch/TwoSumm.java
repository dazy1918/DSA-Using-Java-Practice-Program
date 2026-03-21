package TwoPointerApproach;

import java.util.Arrays;

public class TwoSumm {

    public static void twosum(int arr[], int target) {

        Arrays.sort(arr); // Two pointer ke liye array sorted hona chahiye

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentsum = arr[left] + arr[right];

            if (currentsum == target) {
                System.out.println("Pair found: " + arr[left] + " , " + arr[right]);
                System.out.println("Target : " + arr[left] + " + " + arr[right] + " = " + target);
                return;

            } else if (currentsum > target) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 7, 8, 5, 4, 3, 19 };
        int target = 13;

        twosum(arr, target);
    }
}
