package Array_list;
import java.util.*;

public class twoSumUsingTwoPointers {
    public static void main(String[] args){
        int arr[] = {2,7,11,15};
        int target = 9;

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        while(i < j)
        {
            if(arr[i] + arr[j] == target)
            {
                System.out.println(i + " " + j);
                i++;
            }
            else if(arr[i] + arr[j] < target)
            {
                i++;
            }
            else if(arr[i] + arr[j] > target)
            {
                j--;
            }
        }
    }
}
