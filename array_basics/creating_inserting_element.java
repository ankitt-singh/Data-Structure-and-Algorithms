package array_basics;
import java.util.Scanner;

public class creating_inserting_element {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.println("enter the size of array.");
        int size = obj.nextInt();

        System.out.println("enter the element of the array.");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("enter the element and place you want to place.");
        int newElement = obj.nextInt();
        int newPosition = obj.nextInt();

        // validation of input position

        if(newPosition <0 || newPosition >= size + 1){
            System.out.println("Invalid position");
        }

        int newArr[] = new int[size + 1];
        
        for(int i = 0, j = 0; i < size +1; i++){
            if(i == newPosition){
                newArr[i] = newElement;
            }
            else{
                newArr[i] = arr[j];
                j++;
            }
        }

        for(int i = 0; i < size + 1; i++ ){
            System.out.print(newArr[i] + " ");
        }


    }
}
