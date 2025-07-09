package Practice_demo;
import java.util.*;

public class functionFindPrimeNum {
    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
       
       for(int i = 10; i <= 20; i++)
       {
         if(isPrime(i))
         {
            System.out.println(i);
         }
       }
    }
}
