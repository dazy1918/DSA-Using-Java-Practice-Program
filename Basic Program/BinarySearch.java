public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 9, 6 };
        int target = 9;
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found");
                result = 1;
                break;
            }
        }
    }
}

