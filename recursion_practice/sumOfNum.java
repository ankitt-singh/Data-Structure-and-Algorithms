package recursion_practice;

public class sumOfNum {
    public static int sumOfNum(int i)
    {
        if(i == 0)
        {
            return 0;
        }
        int sum = i + sumOfNum(i - 1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNum(5));
    }
}
