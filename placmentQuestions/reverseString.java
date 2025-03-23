package placmentQuestions;

public class reverseString {
    public static void main(String[] args) {
        String word = "Ankit";
        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse(); // Inbuilt function to reverse string

        System.out.println(reversed.toString());
    }
}

