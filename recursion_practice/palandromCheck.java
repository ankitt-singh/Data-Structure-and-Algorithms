package recursion_practice;

public class palandromCheck {

    public static int palCheck(int nums)
    {
        if(nums == 0)
        {
            return 1;
        }
        int ans = 0;
        int temp = nums%10;
        ans = ans*10 + temp;
        palCheck(nums / 10);
        return ans;
    }
    public static void main(String[] args) {
        int n  = 121;
        if(n == palCheck(n))
        {
            System.out.println("palandrom");
        }
        else
        {
            System.out.println("not a palandrom");
        }

    }
}
