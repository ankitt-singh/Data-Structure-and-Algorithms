package Array_list;

public class maximum_Subarray {
    public static void main(String[] args)
    {
        int nums[] = {5,4,-1,7,8};

        // Given an integer array nums, find the subarray with the largest sum, and return its sum.

        int currentSum = nums[0];
        int maximumSum = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            int option1 = nums[i];
            int option2 = nums[i] + currentSum; 

            currentSum = Math.max(option1, option2);

            if(currentSum > maximumSum)
            {
                maximumSum = currentSum;
            }
        }

        System.out.println(maximumSum);
    }

}
