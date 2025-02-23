package practice_question.Array;
import java.util.*;
public class two_sum {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = obj.nextInt();
        }

        int target = obj.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   System.out.println(i+" "+j);
                // return new int[]{i, j};
                }
            }
        }

        obj.close(); // Closing scanner
    }
}
