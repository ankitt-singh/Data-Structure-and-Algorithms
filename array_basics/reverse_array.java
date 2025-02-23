package array_basics;
import java.util.*;

public class reverse_array {
    public static void main(String[] arge){

        Scanner obj = new Scanner(System.in);
        // taking element input in the array
        System.out.print("Enter the Size and Element in the Array:");
        int size = obj.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }

        // printing the input array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // reversing the array

        int k = 0;
        int l = arr.length - 1;
        while(k < l){
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
        }

        // printing the reverse array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        obj.close(); // Closing scanner
    }
}
