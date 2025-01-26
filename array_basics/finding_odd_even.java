package array_basics;
import java.util.Scanner;

public class finding_odd_even {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size and element of the array");
        int size = obj.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }
        // printing the array
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // finding the number of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else if(arr[i] % 2 != 0 ){
                oddCount++;
            }
        }

        // seprating even and odd numbers
        int evenArr[] = new int[evenCount];
        int evenIndex = 0;
        int oddArr[] = new int[oddCount];
        int oddIndex = 0;

        if(evenCount != 0){
            for(int l = 0; l < size; l++){
                if(arr[l] % 2 == 0){
                    evenArr[evenIndex] = arr[l];
                    evenIndex++;
                }
            } 
        }

        if(oddCount != 0){
            for(int l = 0; l < size; l++){
                if(arr[l] % 2 != 0){
                    oddArr[oddIndex] = arr[l];
                    oddIndex++;
                }
            } 
        }

        // printing the odd and even array
        System.out.println("Even numbers:");
        for(int m = 0; m < evenIndex; m++){
            System.out.print(evenArr[m] + " ");
        }
        System.out.println();

        // printing odd numbers
        // Printing the odd array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.println();

        obj.close();
    }
} 