package Array_list;

public class majorityElement {
    public static void main(String[]args){

    int arr[] = {1,2,2,1,2,2};

    // we have to find the majority element the array

    int count = 0;
    int answer = -1;
    for(int i =0; i < arr.length; i++)
    {
        if(count == 0)
        {
            answer = arr[i];
            count++;
        }
        else
        {
            if(arr[i] == answer)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
    }
    System.out.println(answer);
    System.out.println(count);

}

    
}
