package Array_list;

public class runningSum {
    public static void main (String[] args){

        // 
        int nums[] = {3,1,2,10,1};
        int n = nums.length;
        int prifix[] = new int[n];

        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = nums[i] + sum;
            prifix[i] = sum;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(prifix[i] + " ");
        }
    }
}
