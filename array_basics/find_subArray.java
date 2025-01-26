package array_basics;
import java.util.Scanner;

public class find_subArray {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the size and element of array");
        int size = obj.nextInt();
        int arr[] = new int[size];

        // taking input in array
        for(int i = 0; i < size; i++)
        {
            arr[i] = obj.nextInt();
        }
        // printing the array to check if it is correct or not..
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // we will use two pointer concept in this 
        // we take j for starting and k for ending

        // int j = 0;
        // int k = 0;
        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                for(int k = i; k < j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
 
    }
}
