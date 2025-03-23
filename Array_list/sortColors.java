package Array_list;

public class sortColors {
    public static void main(String[] args){
        int nums[] = {2,0,2,1,1,0};
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                zeros++;
            }
            else if(nums[i] == 1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }

        int i = 0;
        while(i < zeros)
        {
            nums[i] = 0;
            i++;
        }
        while(i < (zeros + ones))
        {
            nums[i] = 1;
            i++;
        }
        while(i < nums.length)
        {
            nums[i] = 2;
            i++;
        }

        for(int j = 0; j < nums.length; j++)
        {
            System.out.print(nums[j] + " ");
        }
    }
}
