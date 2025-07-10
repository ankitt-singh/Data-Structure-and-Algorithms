package Practice_demo.array_demo;
import java.util.*;

public class sortedArrayOrNot {
    public static void main(String[] args)
    {
        // find if the array is sorted or not.

        int []arr = {1,2,3,4,5,7,5};
        for(int o = 0; o < arr.length - 1; o++)
        {
            if(arr[o] > arr[o+1])
            {
                System.out.println("Array is not sorted");
            }
            
        }
    }
    
}
