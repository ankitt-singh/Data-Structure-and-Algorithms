package sorting;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        // taking array as input
        System.out.println("enter the length of the array");
        int l = obj.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter the element of the array");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = obj.nextInt();
        }

        // Sorting the array using bubble sort
        for(int j = 0; j < arr.length - 1; j++)
        {
            for(int k = 0; k < arr.length - 1; k++)
            {
                if(arr[k] > arr[k+1])
                {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;

                }
            }
        }
        // printing the sorted array
        for(int m = 0; m < arr.length; m++)
        {
            System.out.print(arr[m] + " ");
        }

    }
}
