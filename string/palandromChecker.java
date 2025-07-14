package string;
import java.util.*;

public class palandromChecker {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        // we have to check if the given string is a palindrom or not

        System.out.println("enter the string you have to check if it is palandrom or not.");
        String str = obj.nextLine();
        boolean checker = true;
        int i = 0;
        int j = str.length() - 1;

        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                checker = false;
            }
            i++;
            j--;
        }
        if(checker == false)
        {
            System.out.println("string is not palandrom");
        }
        else{
            System.out.println("string is palandrom");
        }


    }
}
