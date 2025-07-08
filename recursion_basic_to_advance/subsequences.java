package recursion_basic_to_advance;
import java.util.*;

public class subsequences {
    public static void printSubsequence(int arr[], int index, List<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }

        // Adding the element in the subsequence array 
        current.add(arr[index]);
        printSubsequence(arr, index + 1, current);

        // Removing the element from the array
        current.remove(current.size() - 1);
        printSubsequence(arr, index + 1, current);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int index = 0;
        ArrayList<Integer> current = new ArrayList<>();
        printSubsequence(arr, 0, current);
    }
}
