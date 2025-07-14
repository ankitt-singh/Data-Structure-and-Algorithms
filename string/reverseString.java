package string;

public class reverseString {
    public static void main(String[] args)
    {
        // in this we have to reverse the given string and return a string

        String str = "Mango";
        int l = str.length();
        StringBuilder newStr = new StringBuilder();

        for(int i = l - 1; i >= 0 ; i--)
        {
            newStr.append(str.charAt(i));
        }

        newStr.toString();
        System.out.println(newStr);


    }
}
