package Practice_demo;

import java.util.Scanner;

public class questionOne {
    public static void main(String[] args)
    {
        //Write a program to take your name, age, and salary as input and print them.
        Scanner obj = new Scanner(System.in);

        System.out.println("Enten your name:");
        String name = obj.nextLine();
        System.out.println("Enter your age:");
        int age = obj.nextInt();
        System.out.println("Enter your salary:");
        float salary = obj.nextFloat();

        System.out.println("Welcome " + name + "Your age is: " + age + "Your Salary is: " + salary);

    }
}
