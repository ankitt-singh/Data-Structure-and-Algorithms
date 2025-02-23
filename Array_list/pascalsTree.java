package Array_list;
import java.util.*;

public class pascalsTree {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        // creating the main ArrayList of ArrayList 

        ArrayList < ArrayList<Integer>> answer = new ArrayList<>();

        // creating the first ArrayList

        ArrayList <Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        
        answer.add(new ArrayList<> (firstRow)); // we have added first row in the answer ArrayList

        // creating the other roe of the ArrayList 

        // int middleRow = 0;
        for(int i = 1; i < n; i++){
            ArrayList <Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            // middle row
            for(int j = 1; j < i; j++){
              int element = answer.get(i-1).get(j-1) + answer.get(i-1).get(j);
              currentRow.add(element);  
            }

            currentRow.add(1);

            answer.add(new ArrayList <>(currentRow));
            // middleRow++;
        }
        // return answer;

        // Printing the Pascal's Triangle
        for (ArrayList<Integer> row : answer) {
            System.out.println(row);
        }






        obj.close();
    }
}
