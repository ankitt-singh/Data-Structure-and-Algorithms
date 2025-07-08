package recursion_basic_to_advance;

public class Palindrome {

    public static boolean checker(String a, int b, int c){
        if(b >= c)
        {

            return true;
        }
        else if(a.charAt(b) != a.charAt(c))
        {
            return false;
        }
        return checker(a, b + 1, c - 1);
    }
    public static void main(String[] args) {
        String str = "madam";

        if(checker(str, 0, str.length() - 1) == true)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
