package Practice_demo.array_demo;
import java.util.*;

public class linearSearchOfTarget {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the target element you want to search: ");
        int target = obj.nextInt();

        int arr[] = {10,15,20,25,30,35,40,45};

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                System.out.println(i);
            }
        }
    }
}
