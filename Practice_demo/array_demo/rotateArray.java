package Practice_demo.array_demo;
import java.util.*;

public class rotateArray {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        // taking no of rotation as input
        System.out.println("Enter the number of rotation: ");
        int leftRotate = obj.nextInt();

        int arr[] = {10,20,30,40,50};
        // checking if the no of rotation is greater then length of array
        if(leftRotate > arr.length)
        {
            leftRotate = leftRotate % arr.length;
        }

        // Creating new array to store the rotated array.
        int finalArr[] = new int[arr.length];
        int newIndex;

        for(int i = 0; i < arr.length; i++)
        {
            newIndex = i - leftRotate;
            if(newIndex < 0)
            {
                newIndex = newIndex + arr.length;
            }
            finalArr[newIndex] = arr[i];
            
        }

        // printing the rotated array
        for(int k = 0; k < arr.length; k++)
        {
            System.out.print(finalArr[k] + " ");
        }

    }
    
}
