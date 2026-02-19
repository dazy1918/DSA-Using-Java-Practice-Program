// Find factorial of n

public class Recursion4 {

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }

    public static void main(String[] args) {

        int n = 8;
        int result = fact(n);
        System.out.print(result);

    }
}
