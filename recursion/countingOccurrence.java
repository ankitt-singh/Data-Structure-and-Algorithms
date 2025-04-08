package recursion;

public class countingOccurrence {
    public static void recur(int index, int target, int arr[])
    {
        if(index >= arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            System.out.println(index + " " + arr[index]);  
        }
        recur(index + 1, target, arr);
    }
    public static void main(String[] args){
        int index = 0;
        int target = 4;
        int arr[] = {1,2,4,3,5,4,6,4,8,7,4,4,9,4,9,4};

        recur(index, target, arr);
    }
}
