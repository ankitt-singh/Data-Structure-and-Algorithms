package Array_list;

public class rotateArrayMedium {

    public void rotate(int nums[], int start, int end){
        // end = nums.length - 1;
        for(start = 0; start < end; start++)
        {
            int temp = 0;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
        }
    }
    public static void main(String[] args){

        // int nums[] = {1,2,3,4,5,6,7};
        // int k = 3;

        // first we check if the number of rotation is greater then array length

        // if(k > nums.length)
        // {
        //     k = k % nums.length;
        // }

        // // now we reverse the entire array
        // int j = nums.length - 1;
        // for(int i = 0; i < j; i++)
        // {
        //     int temp = 0;
        //     temp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = temp;
        //     j--;
        // }
        // for (int i = 0; i < nums.length; i++)
        // {
        //     System.out.println(nums[i] + " ");
        // }


        // first we reverse the full array
        int nums[] = {1,2,3,4,5,6,7};
        int n = nums.length;

        int k = k % n;

        rotate(nums, 0, n - 1);

        // reversing the firat k elements

        rotate(nums, 0, k);

        // reversing the remaining elements

        rotate(nums, k+1, n - 1);


        
    }
}
