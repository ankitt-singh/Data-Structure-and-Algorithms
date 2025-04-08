package recursion_basic_to_advance;

public class printNameForNtimes {
    public static void printName(int num)
    {
        if(num == 0)
        {
            return;
        }
        System.out.println("Ankit");
        printName( num - 1);
    }

    public static void main(String[] args) {
        printName(2);
    }
}
