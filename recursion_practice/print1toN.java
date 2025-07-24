package recursion_practice;

public class print1toN {

    public static void print(int j)
    {
        if(j == 0)
        {
            return;
        }
        print(j - 1);
        System.out.println(j);
    }
    public static void main(String[] arge)
    {
        print(20);
    }
}
