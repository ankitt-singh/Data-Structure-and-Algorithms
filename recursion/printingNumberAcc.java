package recursion;

public class printingNumberAcc {
    public static void accending(int n)
    {
        if(n == 0)
        {
            return;
        }
        accending(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        accending(n);
    }
}
