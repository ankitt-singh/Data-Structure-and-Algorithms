package array_basics;
import java.util.*;

public class max_min_element {
    public static void main(String[] arg){
    Scanner obj = new Scanner(System.in);

    int arr[] = {10,20,30,40,50,60,70,80,100};
    int min = arr[0];
    int max = arr[0];

    for( int i = 0; i < arr.length; i++ ){
        if( arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println("max =" + max);

    for( int i = 0; i < arr.length; i++ ){
        if( arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("min =" + min);

    obj.close(); // Closing scanner

}
}
