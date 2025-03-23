package recursion;

public class factorialOfN {
    public static long factorial(long n)
    {
        if(n <= 1)
        {
            return 1;
        }
        long fact = n * factorial(n-1);
        return fact;
    }
    public static void main(String[] args)
    {
        long n = 5;
        System.out.println(factorial(n));
    }
}
