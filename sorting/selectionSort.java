package sorting;

public class selectionSort {
    public static void main(String[] args) {
        // In selection Sort we first select the the smallest number and assign it correct location

        int arr[] = {5,8,2,6,1,7};
        for(int i = 0; i < arr.length - 1; i++)
        {
            int smallestNum = arr[i];
            int index = i;
            // finding the smallest number
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < smallestNum)
                {
                    smallestNum = arr[j];
                    index = j;
                }
            }
            // swaping the smallest number at its correct position
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            
        }

        for(int k = 0; k < arr.length; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
}
