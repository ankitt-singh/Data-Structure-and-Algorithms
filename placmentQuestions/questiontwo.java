package placmentQuestions;

import java.util.*;
public class questiontwo{

    static int GetBMICategory(int weight, float height){
        float BMI = weight / (height * height);

        if( BMI < 18)
        {
            System.out.println("Underweight");
            return 0; // Underweight 
        }
        else if( BMI >= 18 && BMI < 25)
        {
            System.out.println("normal");
            return 1; // Normalweight
        }
        else if( BMI >= 25 && BMI < 30) 
        {
            System.out.println("overweight");
            System.out.println(BMI);
            return 2; // overweight
        }
        else if (BMI >= 30 && BMI < 40) 
        {

            return 3; // Obese
        }
        else if( BMI >= 40)
        {
            return 4; // Saverely obese
        }
        return -1;
    }
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your weight in kg and height in meters");
        int weight = obj.nextInt();
        float height = obj.nextFloat();
        System.out.println(GetBMICategory(weight, height));

        obj.close(); // Close scanner to prevent resource leak

    }
}
