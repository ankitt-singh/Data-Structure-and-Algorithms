package Practice_demo.array_demo;
import java.util.*;

public class printingSubArray {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the array length");
        int length = obj.nextInt();
        int arr[] = new int[length];
        for(int i = 0; i <= length - 1; i++)
        {
            arr[i] = obj.nextInt();
        }
        // for(int i = 0; i <= length - 1; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        for(int j = 0; j <= length - 1; j++)
        {
            for(int k = j; k < length; k++)
            {
                for(int l = j; l <= k; l++)
                {
                    System.out.print(arr[l] + " ");
                }
                System.out.println();
            }
        }

    }
}
