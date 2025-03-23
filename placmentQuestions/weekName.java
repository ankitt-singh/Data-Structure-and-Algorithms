package placmentQuestions;
import java.util.*;
public class weekName {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int day = obj.nextInt();
        if(day == 1)
        {
            System.out.println("Monday");
        }
        else if(day == 2)
        {
            System.out.println("Tuesday");
        }
        else if(day == 3)
        {
            System.out.println("Wednesday");
        }
        else if(day == 4)
        {
            System.out.println("Thrusday");
        }
        else if(day == 5)
        {
            System.out.println("Friday");
        }
        else if(day == 6)
        {
            System.out.println("Saturday");
        }
        else if(day == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Enter a valid input form 1 to 7");
        }

        obj.close();
    }
}
