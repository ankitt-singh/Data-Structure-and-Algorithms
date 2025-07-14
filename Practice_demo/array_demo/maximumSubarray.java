package Practice_demo.array_demo;

public class maximumSubarray {
    public static void main(String[] args)
    {
        // in this question we have to find a subarray from the given array whose sum is greater then anyother 
        // subarray.

        int arr[] = {5,4,-1,7,8};
        int currentsum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i ++)
        {
            int option1 = arr[i];
            int option2 = arr[i] + currentsum;

            currentsum = Math.max(option1, option2);

            if(currentsum > maxSum)
            {
                maxSum = currentsum;
            }
        }
        // return maxSum;
        System.out.println(maxSum);

    }
}
