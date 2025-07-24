package recursion_practice;

public class wayToReachNthStair {
    // In this problem a man wants to reach the top. He can climbe either 1 stair or 2 stair at a time.
    // count the numbers of way by which he reach the top.

    // In this we can use the fibonacci series to find the number of ways. As the top is comming from the
    // previous two stair case.

    public static int numWay(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }
        int ways = numWay(num - 1) + numWay(num - 2);
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(numWay(3));
    }
}
