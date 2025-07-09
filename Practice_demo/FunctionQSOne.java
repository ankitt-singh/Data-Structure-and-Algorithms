package Practice_demo;
import java.util.*;

public class FunctionQSOne {

    // Printing my name function
    
    public static void printName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] arse){

        Scanner obj = new Scanner(System.in);

        String name = obj.nextLine();

        printName(name);
    }
}
