/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;





public class E19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double height = 0.0;
        double weight = 0.0;

        System.out.println("Enter the Height in Inches");
        height = scan.nextDouble();
        System.out.println("Enter the weight in pounds");
        weight = scan.nextDouble();


        double BMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f",BMI));


        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI >25){
            System.out.println("You are Overweight. You should see your doctor.");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight. You should consult with your doctor.");
        }

    }
}
