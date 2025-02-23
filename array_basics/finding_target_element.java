package array_basics;
import java.util.*;

public class finding_target_element {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        
        int arr[] = {1,2,3,5,8,10};
        System.out.println("Enter the number you want to find:");
        int targetValue = obj.nextInt();
        int answer = -1;

        for(int i = 0; i < arr.length; i++){
            if(targetValue == arr[i]){
                answer = i;
            }
        }

        if(answer == -1){
            System.out.println("Enter value not present.");
        }
        else{
            System.out.println("Enter value present at index" +" "+ answer);
        }
    }
}
