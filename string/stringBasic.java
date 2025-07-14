package string;
import java.util.*;

public class stringBasic {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        //string Decleration

        // String name = "Ankit singh";

        //taking word as input in string

        // System.out.println("From which city you ae from??");
        // String city = obj.next();

        // taking sentance as input

        // System.out.println("Tell me about youself:");
        // String about = obj.nextLine();

        // System.out.println("I am from: " + city);
        // System.out.println(about);

        // String function

        //1. concatenation
        String firstName = "Ankit ";
        String secondName = "Singh";
        System.out.println(firstName + secondName);

        //2. charAt - give us the element at certain index
        System.out.println(firstName.charAt(3));

        //3. length of string
        System.out.println(secondName.length()); 
        
        //4. compare sting - the compare work on the basis of the dictionary order.
        String a = "abcd";
        String b = "efgh";
        System.out.println(a.compareTo(b));
        if(a.compareTo(b) > 0)
        {
            System.out.println(a + " " + "is bigger.");
        }
        else if(a.compareTo(b)< 0)
        {
            System.out.println(b + " " + "is bigger." );

        }
        else
        {
            System.out.println("both are equal");
        }

        //5. substring
        String str = "Suraksha Shetty";
        System.out.println(str.substring(2, 8));

    }
}
