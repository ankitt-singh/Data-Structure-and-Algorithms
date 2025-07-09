package Practice_demo.array_demo;
import java.util.*;

public class arrayBasic {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        // creating array and printing the element of array

        // int num[] = {10,15,20,28};
        // for(int i = 0; i <= num.length; i++)
        // {
        //     System.out.println(num[i]);
        // }

        // taking array element as input in the array.
        // int length = obj.nextInt();
        // int newArr[] = new int[length];
        // for(int j = 0; j <= length  - 1; j++)
        // {
        //     newArr[j] = obj.nextInt();
        // }
        // for(int k = 0; k <= length - 1; k++)
        // {
        //     System.out.print(newArr[k] + " ");
        // }

        // declearing 2d array 

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int x = 3;
        int y = 3;
        int numarr[][] = new int[x][y];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
