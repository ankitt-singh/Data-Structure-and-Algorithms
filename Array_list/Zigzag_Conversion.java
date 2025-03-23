package Array_list;

import java.util.ArrayList;

public class Zigzag_Conversion {
    public static void main(String[] args){
        String s = "Ankitsingh";
        int numRow = 3;
        // we will create a main ArrayList
        ArrayList <ArrayList<Character>> arr = new ArrayList<>();
        
        // We will store empty array in the arraylist
        for(int i = 0; i < numRow; i++)
        {
            ArrayList <Character> currentRow = new ArrayList <>();
            arr.add(new ArrayList<>(currentRow));
        }

        // now we will store all the characters in the arraylist

        int rowIndex =0;
        int turn =0;
        for(int i =0; i < s.length(); i++)
        {
            arr.get(rowIndex).add(s.charAt(i));
            //now we write condition for the zigzag storage
            if(turn == 0){
                rowIndex++;
                if(rowIndex == numRow){
                    rowIndex = rowIndex - 2;
                    turn = 1;
                }
            }
            else{
                rowIndex--;
                if(rowIndex <= -1){
                    rowIndex = rowIndex + 2;
                    turn = 0;
                }
            }
        }

        StringBuilder answer = new StringBuilder("");
        for(int i = 0; i < arr.size(); i++)
        {
            for(int j = 0; j < arr.get(i).size(); j++)
            {
                answer.append(arr.get(i).get(j));
            }
        }

        System.out.println(answer);

        // return answer.toString();
        
    }
}
