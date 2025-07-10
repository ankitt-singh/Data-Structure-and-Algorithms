package Practice_demo.array_demo;

public class findMaxAndMin {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,8,56};

        // we assume that the first element is mak and min
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if( arr[i] >= max)
            {
                max = arr[i];
            }
        }
        for(int j = 0; j < arr.length; j++)
        {
            if( arr[j] <= min)
            {
                min = arr[j];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
