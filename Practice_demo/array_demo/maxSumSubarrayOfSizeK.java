package Practice_demo.array_demo;

public class maxSumSubarrayOfSizeK {
    public static void main(String[] arge)
    {
        // in this we are following the sliding approach
        // in this first we find the sum till the k and then for next window we add i element and sub i - k element

        int num[] = {100,200,300,400,500,600,700};
        int answer = 0; 
        int k = 2;
        int i = 0;
        int sum = 0;

        // sum of first window
        while(i < k)
        {
            sum = sum + num[i];
            i++;
        }
        if(sum > answer)
        {
            answer = sum;
        }

        // sum for next window
        while(i < num.length)
        {
            sum = sum + num[i];
            sum = sum - num[i - k];
            if(sum > answer)
            {
                answer = sum;
            }
            i++;
        }

        System.out.println(sum);

    }
}
