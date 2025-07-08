package recursion_basic_to_advance;

public class reversingArray {

    public static int arrayReverse(int arr[], int i, int j)
    {
        if(i >= j)
        {
            return 1;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arrayReverse(arr, i + 1, j - 1); 
    }
    public static void main(String[] args) {
        int nums[] = { 1,2,3,4,5};
        arrayReverse(nums, 0, 4);
        for(int l = 0; l < nums.length; l++)
        {
            System.out.print(nums[l] + " ");
        }
    }
}
