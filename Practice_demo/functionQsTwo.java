package Practice_demo;
import java.util.*;

public class functionQsTwo {
    // make a function to add 2 numbers and return the sum
    // public static int addTwoNumber(int num1, int num2)
    // {
    //     int sum = num1 + num2;
    //     return sum;
    // }

    // public static void main(String[] args){
    //     Scanner obj = new Scanner(System.in);

    //     int num1 = obj.nextInt();
    //     int num2 = obj.nextInt();

    //     System.out.println(addTwoNumber(num1, num2));
        
    // }

    // make a function to multiply 2 number and return the product.
    // public static float multiplyNumber( float num1, float num2)
    // {
    //     float ans = num1 * num2;
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     Scanner obj = new Scanner(System.in);
    //     float a = obj.nextFloat();
    //     float b = obj.nextFloat();

    //     System.out.println(multiplyNumber(a, b));
    // }


    // finding factorial of a number
    public static int factorialOfNum(int n)
    {
        int ans = 1;
        for(int i = 1; i <= n; i++)
        {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(factorialOfNum(num));
    }
}
