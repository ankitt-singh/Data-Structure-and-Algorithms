package placmentQuestions;
import java.util.Scanner;
public class questionOne {
    static int checket(int a, int b, int c){

        int sum = 0;
        if(c == 1)
        {
            sum = a + b;
        }
        else if(c == 2)
        {
            sum = a - b;
        }
        else if(c == 3)
        {
            sum = a * b;
        }
        else if(c == 4)
        {
            sum = a / b;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        System.out.println(checket(a,b,c));
        

        obj.close();
    }
}
