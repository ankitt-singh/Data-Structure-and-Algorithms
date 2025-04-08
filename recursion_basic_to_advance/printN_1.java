package recursion_basic_to_advance;

public class printN_1 {
    public static void printNtoOne(int j)
    {
        if(j == 0 )
        {
            return;
        }
        System.out.println(j);
        printNtoOne(j - 1);
    }
    public static void main(String[] args) {
        printNtoOne(5);
    }
}
