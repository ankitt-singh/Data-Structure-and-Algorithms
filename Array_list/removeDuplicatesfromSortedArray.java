package Array_list;

public class removeDuplicatesfromSortedArray {
    public static void main(String[] args){
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        int i = 0;
        int j = 1;

        while(j < arr.length)
        {
            if(arr[i] != arr[j])
            {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        for(int k = 0; k <= i; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
}
