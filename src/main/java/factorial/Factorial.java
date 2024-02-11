package factorial;

public class Factorial {
    public static int factorial(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int input) {
        // base case
        if (input == 1) {
            return 1;
        }
        // recursive case
        return input * recursiveFactorial(input - 1);
    }
}