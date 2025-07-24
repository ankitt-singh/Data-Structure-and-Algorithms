package recursion_practice;

public class fibonacci_Num_At_n {
    public static  int fibonacci(int i)
    {
        if(i == 0 || i == 1)
        {
            return i;
        }
        int fibo = fibonacci(i - 1) + fibonacci( i - 2);
        return fibo;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
