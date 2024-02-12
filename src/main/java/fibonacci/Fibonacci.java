package fibonacci;

public class Fibonacci {
    public static int fibonacci(int input) {
        int firstTerm = 0;
        int secondTerm = 1;
        if (input <= 0) {
            return -1; // Return an error code for invalid input
        } else if (input == 1) {
            return firstTerm;
        } else if (input == 2) {
            return secondTerm;
        } else {
            int currentTerm = 0;
            for (int i = 3; i <= input; i++) {
                currentTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = currentTerm;
            }
            return currentTerm;
        }
    }

    public static int recursiveFibonacci(int input) {
        // base case
        if (input < 2) {
            return input;
        }
        // recursive case
        return recursiveFibonacci(input - 1) + recursiveFibonacci(input - 2);
    }
}