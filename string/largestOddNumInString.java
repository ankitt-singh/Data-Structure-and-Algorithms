package string;

public class largestOddNumInString {
    public static void main(String[] args)
    {

        //In this we have find the largest odd number in a string

        // Input: num = "52"
        // Output: "5"
        // Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
        // Example 2:

        // Input: num = "4206"
        // Output: ""
        // Explanation: There are no odd numbers in "4206".

        String nums = "52";
        for(int i = nums.length() -1; i >= 0; i++)
        {
            char c = nums.charAt(i);
            if((c - '0') % 2 != 0)
            {
                System.out.println(nums.substring(0, i + 1));
                break;
            }
        }
    }
}
