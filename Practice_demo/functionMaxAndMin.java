package Practice_demo;
import java.util.*;

public class functionMaxAndMin {
    // find the max and min between two numbers
    public static void maxMin(int a, int b)
    {
        if(a > b)
        {
            System.out.println("Number " + a + " is greater then b");
        }
        else if(b > a)
        {
            System.out.println("Number " + b + " is greater then a");
        }
        else
        {
            System.out.println("Both the number are equal.");
        }
        return;
    }
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the both number following you want to compare.");
        int x = obj.nextInt();
        int y = obj.nextInt();

        maxMin(x, y);

    }
}
