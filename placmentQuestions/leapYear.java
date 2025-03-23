package placmentQuestions;
import java.util.*;
public class leapYear {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int year = obj.nextInt();

        if(year % 4 == 0 && year % 100 != 100)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
        obj.close();
    }
}
