package Practice_demo.array_demo;
import java.util.*;

public class ArrayinsertElemAtSpecificPlace {
    public static void main(String[] args)
    {
        // Insert an element at specific place in an array

        Scanner obj = new Scanner(System.in);

        int []arr = {10,15,70,75,60};

        System.out.println("Enter the elemant");
        int newElem = obj.nextInt();
        System.out.println("Enter the position you want to place");
        int position = obj.nextInt();

        int j = 0;

        int newArr[] = new int[arr.length + 1];

        for(int i = 0; i < newArr.length; i++)
        {
            if(i == position)
            {
                newArr[i] = newElem;
            }
            else{
                newArr[i] = arr[j];
                j++;
            }
        }

        for(int k = 0 ; k < newArr.length; k++)
        {
            System.out.print(newArr[k] + " ");
        }

    }
}
