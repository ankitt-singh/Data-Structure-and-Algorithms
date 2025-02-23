package array_basics;
import java.util.*;

public class finding_missing_num {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6,7,8,0};
        int sum1 = 0; int sum2 = 0;
        // finding the number of element in array
        int n = arr.length;
        // finding the sum of n number
        sum1 = (n * (n + 1))/ 2;
        // finding the sum of element of the array
        for(int i = 0; i < arr.length; i++){
            sum2 = sum2 + arr[i];
        }

        // finding the missing element
        int missing_element = sum1 - sum2;

        System.out.println("the missing number = " + missing_element);
        System.out.println(arr.length);
    }
    
}
