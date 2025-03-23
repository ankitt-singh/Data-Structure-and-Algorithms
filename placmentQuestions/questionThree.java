package placmentQuestions;
import java.util.*;

public class questionThree {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the starting point");
        int startPoint = obj.nextInt();
        System.out.println("enter the ending point");
        int endPoint = obj.nextInt();

        for(int i = startPoint; i <= endPoint; i++)
        {
            // reversing the number
            int number = i;
            int reverse = 0;

            while(number != 0)
            {
                int digit = number % 10; // we find the last digit 
                reverse = reverse * 10 + digit; // add the last dight of number to the first place
                number = number / 10 ; // this will remove the last digit from the number.
            }
            if(i == reverse)
            {
               System.out.println(i);
            }
        }
        obj.close();
    }
}
