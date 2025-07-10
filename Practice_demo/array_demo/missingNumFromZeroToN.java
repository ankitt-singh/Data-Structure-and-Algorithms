package Practice_demo.array_demo;
import java.util.*;

public class missingNumFromZeroToN {
    public static void main(String[] arge)
    {
        Scanner obj = new Scanner(System.in);

        // Finding the missing number between range of 0 to n

        int arr[] = {1,2,3,0,4,5,6};
        
        // First we count the number of the element in the array and then we find the the sum of n number

        int n = arr.length;

        int sum1 = (n * (n + 1)) / 2;

        int sum2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum2 = sum2 + arr[i];
        }

        int missnum = sum1 - sum2;

        System.out.println("Missing number from the range of 0 to " + n + ": " + missnum );
    }   
}
