//Find sum of first n natural numbers

public class recursion3 {

    public static int sum(int n) {

        if (n == 0) { // Base case
            return 0;
        }

        return n + sum(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
