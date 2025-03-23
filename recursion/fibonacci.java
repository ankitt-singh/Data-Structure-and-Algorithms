package recursion;

public class fibonacci {
    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        int answer = fibonacci(n - 1) + fibonacci(n - 2);
        return answer;
    }

    public static void main(String[] args)
    {
        System.out.println(fibonacci(5));
    }
}
