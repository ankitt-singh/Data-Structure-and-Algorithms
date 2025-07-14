package Practice_demo.array_demo;
import java.util.*;
public class demomajorityElement {
    public static void main(String[] args)
    {
        // in this question we have to finnd the majority element in the array.

        int arr[] = {2,5,8,6,8,9,8};
        int count = 0, answer = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(count == 0)
                {
                    answer = arr[i];
                    count++;
                }
            else 
            {
                if(answer == arr[i])
                    {
                        count++;
                    }
                else
                    {
                        count--;

                    }
            }
        }
        System.out.print("The majority element is " + answer + " and it is repeated over " + count + " times.");


    }
}
