//Print numbers from 1 to n

public class Recursion2 {

    public static void printDec(int n) {

        if (n == 10) { // Base case
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printDec(n + 1); // Recursive call
    }

    public static void main(String[] args) {
        int n = 1;
        printDec(n);
    }
}
