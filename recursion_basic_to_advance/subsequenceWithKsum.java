package recursion_basic_to_advance;
import java.util.*;

public class subsequenceWithKsum {

    public static void kSum(int arr[], int index, int sum, List<Integer> curr, int target){
        if(index == arr.length)
        {
            if(sum == target)
            {
                System.out.println(curr);
                
            }
            return; 
        }

        // adding the element in the current 
        curr.add(arr[index]);
        sum = sum + arr[index];
        kSum(arr, index + 1, sum, curr, target);

        // removing the element fro the index
        curr.remove(curr.size() - 1);
        sum = sum - arr[index];
        kSum(arr, index + 1, sum, curr, target);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 6;
        int sum = 0;
        ArrayList <Integer> curr = new ArrayList<>();
        kSum(arr, 0, sum, curr, target);
    }
    
}
