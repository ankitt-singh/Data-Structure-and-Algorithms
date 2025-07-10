package Practice_demo.array_demo;
import java.util.*;

public class findingEvenAndOdd {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6};
        // we are finding the count of even and odd number
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenCount ++;
            }
            else
            {
                oddCount ++;
            }
        }

        // now we are creating the index for even and odd index and also creating the even and odd array for storing element

        int oddIndex = 0;
        int evenIndex = 0;
        int evenArr[] = new int[evenCount];
        int oddArr[] = new int[oddCount];

        // putting even element
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] % 2 == 0)
            {
                evenArr[evenIndex ++] = arr[j];
            }
            else if(arr[j] % 2 != 0)
            {
                oddArr[oddIndex ++] = arr[j];
            }
        }

        // printing the even and odd array
        for(int l = 0; l <= evenArr.length - 1; l++)
        {
            System.out.print(evenArr[l] + " ");
        }
        System.out.println();

        for(int m = 0; m <= oddArr.length - 1; m++)
        {
            System.out.print(oddArr[m] + " ");
        }
    }
}
