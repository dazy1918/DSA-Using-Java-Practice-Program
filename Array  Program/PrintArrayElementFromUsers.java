import java.util.*; // Import Scanner for input

public class Array11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        int print[] = new int[5]; // Declare an array of size 5

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < print.length; i++) {
            print[i] = sc.nextInt();
        }

        // Print the array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < print.length; i++) {
            System.out.println("print[" + i + "] = " + print[i]);
        }
    }
}
