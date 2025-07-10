package Practice_demo.array_demo;

public class findingTwoElementSumEqualToTarget {

    public static void main(String[] args){
        int arr[] = {10,45,28,95,31,56};
    int target = 41;

    for(int i = 0; i < arr.length; i++)
    {
        for(int j = i + 1; j < arr.length; j++)
        {
            if(arr[i] + arr[j] == target){
                System.out.println("Index of the element whose sum is equal to the target: " + i + " " + j);
            }
        }
    }

    }
}
