package Practice_demo;
import java.util.*;

public class QuestionFour {
    public static void main(String[] args){

        // Write a program to demonstrate all arithmetic, relational, and logical operators.
        // Calculate simple interest using SI = (P×R×T)/100.
        // Use compound assignment operators in a small math expression.

        Scanner obj = new Scanner(System.in);
        
        int p = obj.nextInt();
        int r = obj.nextInt();
        int t = obj.nextInt();

        int si = (p*r*t)/100;
        System.out.println(si);
    }   
}
