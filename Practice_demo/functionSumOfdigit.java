package Practice_demo;
import java.util.*;

public class functionSumOfdigit {

    // Find the sum of the digits of the number
    public static int sumOfdigit(int num)
    {
        int sum = 0;
        for(int i = 0; i <= num; i++)
        {
            int num2 = num % 10;
            sum = sum + num2;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args){

        System.out.println(sumOfdigit(123));
    }
}
