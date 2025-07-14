package Practice_demo.array_demo;
import java.util.*;

public class mergSortedArr {
    public static void main(String[] args)
    {
        //WE HAVE TO MERGE TWO SORTED ARRAY

        // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        // Output: [1,2,2,3,5,6]
        // Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        // The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3, n = 3;

        int i = 0, j =0, k = 0;

        int nums3[] = new int[m + n];
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                nums3[k] = nums1[i];
                i++;
            }
            else
            {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        

        // if nums2 finishe first
        for(int l = i; l < m; l++)
        {
            nums3[k] = nums1[l];
            k++;
        }

        // if nums1 finishe first
        for(int o = j; o < n; o++)
        {
            nums3[k] = nums2[o];
            k++;
        }

        // printing merged array
        for(int p = 0; p < nums3.length; p++)
        {
            System.out.print(nums3[p] + " ");
        }
    }
}
