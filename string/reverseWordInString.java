package string;

public class reverseWordInString {
    public static void main(String[] args)
    {
        String s = "the sky is blue";
        String arr[] = s.split(" ");
        String result = "";

        for(int i = arr.length - 1; i >= 0;  i--)
        {
            if(arr[i].length() == 0)
            {
                continue;
            }
            if(result.length() == 0)
            {
                result = result + arr[i];
            }
            else{
                result = result + " " + arr[i];
            }
        }

        System.out.println(result);
    }
}
