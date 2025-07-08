package recursion_basic_to_advance;

public class sumofNnumbers {

    public static int sumofNnumber(int n)
    {
        if(n < 1)
        {
            return 0;
        }
        int sum = n + sumofNnumber( n - 1);
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sumofNnumber(4));
    }
}
