package placmentQuestions;
import java.util.*;

public class findingTableofNumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int start = obj.nextInt();
        int end = obj.nextInt();

        for(int i = start; i <= end; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
            System.out.println(i + " " + "* " + "" + j + " = " + i * j );
            }
            System.out.println();
        }
        obj.close();
    }   
}
