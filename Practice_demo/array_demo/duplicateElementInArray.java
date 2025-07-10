package Practice_demo.array_demo;

public class duplicateElementInArray {
    public static void main(String[] args) {
        // find the duplicate number in the array

        int arr[] = {1,1,1,2,3,4,5};
        // finding the max element in the array
        int maxElement = 0;
        for(int i = 0; i < arr.length; i++)
        {
            maxElement = Math.max(maxElement, arr[i]);
        }

        // creating a frequency array of maxElement length

        int feq[] = new int[maxElement + 1];
        for(int j = 0; j < arr.length; j++)
        {
            feq[arr[j]]++;
        }

        for(int k = 0; k < feq.length; k++)
        {
            if(feq[k] >= 2)
            {
                System.out.println(k);
            }
        }
    }
}
