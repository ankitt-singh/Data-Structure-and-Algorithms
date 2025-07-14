package Practice_demo.array_demo;
import java.util.*;

public class moveZeroEnd {
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    int arr[] = {2,0,5,0,8,0};
    int i = 0, j = 0;
    while(j < arr.length)
    {
        if(arr[j] != 0)
        {
          arr[i] = arr[j];
          i++;  
        }
        j++;
    }

    // making remaning element zero
    while(i < arr.length)
    {
        arr[i] = 0;
        i++;
    }

    for(int k = 0; k < arr.length; k++)
    {
        System.out.print(arr[k] + " ");
    }

    obj.close();

}

}
