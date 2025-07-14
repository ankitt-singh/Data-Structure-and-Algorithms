package Practice_demo.array_demo;

public class removingDuplicateFromSortedArr {
    public static void main(String[] args) {
       int arr[] ={0,0,1,1,1,2,2,3,3,4};

    // in this question we have to remove the duplicates and also we have the find the number of unique elaments.

    int count = 0;
    int i = 0, j = 0 ;
    while(j < arr.length)
        {
            if(arr[i] != arr[j])
            {
                i++;
                arr[i] = arr[j];
                count++;
            }
            j++;
        }
        System.out.println(count);
        for(int k = 0; k < arr.length; k++)
        {
            System.out.print(arr[k]);
        } 
    }
}
