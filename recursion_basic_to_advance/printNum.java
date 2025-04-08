package recursion_basic_to_advance;

public class printNum {

    public static void printNumber(int n , int m)
    {
        // if(n == 11)
        // {
        //     return;
        // }
        // System.out.println( n);
        // printNumber(n + 1);
        if(n == m)
        {
            return;
        }
        System.out.println(n);
        printNumber( n + 1 , m);
    }
    
    public static void main(String[] args) {
        
        int number = 1;
        printNumber(1, 4);
    }
}
