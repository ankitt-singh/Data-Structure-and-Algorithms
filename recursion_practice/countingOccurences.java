package recursion_practice;

public class countingOccurences {
    public static void occurence(int arr[], int target, int index)
    {
        if(index >= arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            System.out.println(index);
        }
        occurence(arr, target, index + 1);
    }
    public static void main(String[] args)
    {
        int index = 0;
        int target = 5;
        int newArr[] = {1,2,5,3,4,5};
        occurence(newArr, target, index);
    }
}
