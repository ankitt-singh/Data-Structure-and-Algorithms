package recursion_basic_to_advance;

public class factorialofNumber {
    public static long factorial(int n)
    {
        if(n <= 0)
        {
            return 1;
        }
        long fact = n * factorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
