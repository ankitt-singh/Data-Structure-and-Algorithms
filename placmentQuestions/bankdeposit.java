package placmentQuestions;
import java.util.*;
public class bankdeposit {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int day = obj.nextInt();
        int sum = 0;
        for(int i = 0;i<= day; i++ )
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
