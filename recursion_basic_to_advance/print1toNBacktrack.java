package recursion_basic_to_advance;

public class print1toNBacktrack {

    public static void printUsingBacktracking(int n){
        if(n == 0){
            return;
        }
        printUsingBacktracking(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printUsingBacktracking(10);
    }
}
