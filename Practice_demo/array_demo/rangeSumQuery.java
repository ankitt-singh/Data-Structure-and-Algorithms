package Practice_demo.array_demo;

public class rangeSumQuery {
    public static void runningSum(int arr[], int left, int right)
    {
        int sum = 0;
        int prifix[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            prifix[i] = sum;
        }
        
        for(int i = 0; i < prifix.length; i++)
        {
            System.out.print(prifix[i] + " ");
        }
        System.out.println();

        if(left == 0)
        {
            System.out.println(prifix[right]);
        }
        else
        {
            System.out.println(prifix[right] - prifix[left - 1]);
        }
    }
    public static void main(String[] args)
    {
        // Given an integer array nums, handle multiple queries of the following type:
        // Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
        // Implement the NumArray class:
        // NumArray(int[] nums) Initializes the object with the integer array nums.
        // int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
        // Example 1:
        // Input
        // ["NumArray", "sumRange", "sumRange", "sumRange"]
        // [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
        // Output
        // [null, 1, -1, -3]



        // in this question we first create a function which will find the running sum and then if we have to find the range sum from n to m 
        // then first we find the sum m and sub n range sum from it.

        int nums[] = {-2, 0, 3, -5, 2, -1};
        int left = 2, right = 5;
        runningSum(nums, left, right);

    }
}
