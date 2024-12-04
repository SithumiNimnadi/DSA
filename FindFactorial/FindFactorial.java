public class FindFactorial {

    // Method to find the factorial
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        FindFactorial obj = new FindFactorial();
        int result = obj.factorial(10);  
        System.out.println("Factorial is " + result);
    }
}
