package recursion_basic_to_advance;

public class fibonacci {

    public static int fibo(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        int last = n - 1;
        int secLast = n - 2;
        return fibo(last) + fibo(secLast) ;
    }
    public static void main(String[] args) {
        
        System.out.println(fibo(10));
    }
}
