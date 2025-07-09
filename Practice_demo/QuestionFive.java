package Practice_demo;
import java.util.*;

public class QuestionFive {
    public static void main(String[] args)
    {
        // Check if a year is a leap year.
        // Find the largest among 3 numbers.
        // Write a simple calculator using switch case.
        // Grade a student using marks input:
        // (>=90: A, >=80: B, >=70: C, >=60: D, else F)

        Scanner obj = new Scanner(System.in);

        // System.out.println("Enter the year which you you want to check: ");
        // int year = obj.nextInt();
        // if(year % 4 == 0)
        // {
        //     System.out.println("this is a leap year");
        // }
        // else{
        //     System.out.println("this is not a leap year");
        // }10

        int a = obj.nextInt();
        int b = obj.nextInt();
        
        System.out.println("enter 1 if want to add, enter 2 if you want to substrac, enter 3 if you want to multiply, enter 4 if you want to devide");
        int ope = obj.nextInt();

        if(ope == 1)
        {
            int ans = a + b;
            System.out.println(ans); 
        }
        else if(ope == 2)
        {
            int ans = a - b;
            System.out.println(ans); 
        }
        else if(ope == 3)
        {
            int ans = a * b;
            System.out.println(ans);
        }
        else if(ope == 4)
        {
            int ans = a / b;
            System.out.println(ans);
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}
