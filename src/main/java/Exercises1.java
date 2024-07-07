public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
        // test your code here!
        Exercises1 exercises = new Exercises1();

        // Test factorial
        System.out.println("Factorial of 5: " + exercises.factorial(5)); // Output: 120

        // Test fibonacci
        System.out.println("Fibonacci of 7: " + exercises.fibonacci(7)); // Output: 13

        // Test generateTriangle
        char[][] triangle = exercises.generateTriangle(5);
        for (char[] row : triangle) {
            System.out.println(new String(row));
        }
    }

}