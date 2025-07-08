package Practice_demo;
import java.util.*;

public class QuestionThree {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        // Widening and narrowing typecasting examples.

        // Widening

        int x = 100;
        float y = x;

        System.out.println(y);

        // Narrowing

        double m = 1000.85;
        int n = (int) m;
        System.out.println(n);

    }
}
