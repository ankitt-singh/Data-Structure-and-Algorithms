package recursion_practice;

public class Factorial_fo_n {
    public static int factorial(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        int fact = n * factorial(n - 1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
