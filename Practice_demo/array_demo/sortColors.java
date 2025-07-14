package Practice_demo.array_demo;

public class sortColors {
    public static void main(String[] args) {
        // Input: nums = [2,0,2,1,1,0]
        // Output: [0,0,1,1,2,2]

        // in this we have to arrange the array in sorted manner
        
        int nums[] = {2,0,2,1,1,0};
        // First we count the no of the 0,1,2 present in the array;
        int zero = 0, one =0, two = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zero++;
            }
            else if(nums[i] == 1)
            {
                one++;
            }
            else if(nums[i] == 2)
            {
                two++;
            }
        }

        System.out.println(zero + " " + one + " " + two);

        // now we ass the 0,1,2 according to how many time they apear.

        int i = 0;
        while(i < zero)
        {
            nums[i] = 0;
            i++;
        }
        while(i < zero + one)
        {
            nums[i] = 1;
            i++;
        }
        while(i < nums.length)
        {
            nums[i] = 2;
            i++;
        }

        for(int k = 0; k < nums.length; k++)
        {
            System.out.print(nums[k] + " ");
        }
    }   
}