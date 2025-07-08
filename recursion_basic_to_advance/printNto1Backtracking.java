package recursion_basic_to_advance;

public class printNto1Backtracking {

    public static void printingNto1(int n, int m){
        if(n > m){
            return;
        }
        printingNto1( n + 1, m);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printingNto1(1, 10);
    }
}
