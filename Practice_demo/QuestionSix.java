package Practice_demo;
import java.util.*;

import recursion.factorialOfN;

public class QuestionSix {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        // Print all even numbers from 1 to N.
        // Find factorial of a number.
        // Print the reverse of a number.
        // Sum of digits of a number.
        // Check if a number is a palindrome.

        //1 

        // int n = obj.nextInt();
        // for(int i = 1; i <= n; i++)
        // {
        //     if(i % 2 == 0)
        //     {
        //         System.out.println(i);
        //     }
        // }

        //2

        // factor of number
        // int fact_num = obj.nextInt();
        // for(int j = 1; j <= fact_num; j++)
        // {
        //     if(fact_num % j == 0)
        //     {
        //         System.out.println(j);
        //     }
        // }

        // factorial of a number
        // int fact = obj.nextInt();
        // int ans = 1;
        // for(int k = fact; k > 0; k--)
        // {
        //     ans = ans * k;
        // }
        // System.out.println(ans);

        //3
        // int num = obj.nextInt();
        // for(int l = 0; l <= num; l++)
        // {
        //    int revNum = num % 10;
        //    System.out.print(revNum);
        //    num = num / 10;
        // }

        //4
        // int digit = obj.nextInt();
        // int sum = 0;
        // for(int i = 0; i <= digit; i++)
        // {
        //     int newdigit = digit % 10;
        //     sum = sum + newdigit;
        //     digit = digit / 10;

        // }
        // System.out.println(sum);

        //5
        int palNum = obj.nextInt();
        int temp = palNum;
        int new_number = 0;
        while(palNum > 0)
        {
            int rev = palNum % 10;
            new_number = new_number * 10 + rev;
            palNum = palNum / 10;
        }
        if(temp == new_number)
        {
            System.out.println("it is a palandrom number");
        }
        
    }
}
