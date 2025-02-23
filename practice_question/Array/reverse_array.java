package practice_question.Array;
import java.util.*;

public class reverse_array {
    public static void main(String[] arge){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size and element of array:");
        int size = obj.nextInt();
        int arr[] = new int[size];

        // taking array element 
        for(int i = 0; i < size; i++){
            arr[i]= obj.nextInt();
        }

        // reversing array
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // printing reverse array

        for(int l = 0; l < size; l++){
            System.out.print(arr[l] + " ");
        }
        System.out.println();

        obj.close(); // Closing scanner
    }
}
