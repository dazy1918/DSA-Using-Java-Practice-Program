public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = { 3, 2, 2, 3, 8, 6, 5, 2 };
        int val = 3;
        int k = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[k++] = nums[i];

        System.out.println("New length: " + k);

        for (int i = 0; i < k; i++)
            System.out.print(nums[i] + " ");
    }
}
