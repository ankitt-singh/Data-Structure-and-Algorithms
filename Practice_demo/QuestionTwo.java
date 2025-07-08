package Practice_demo;
import java.util.*;

public class QuestionTwo {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        // Swap two numbers without using a third variable.
        int num1 = 10;
        int num2 = 20;
        int temp = num1;
        // num1 = num2;
        // num2 = temp;
        System.out.println(num1 + " " + num2);

        // without using third variable

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1 + " " + num2);
    }
}
