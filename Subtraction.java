
package vu.subtraction;

import java.util.Random;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        Random random = new Random();
        
        int number1 = random.nextInt(10); 
        int number2 = random.nextInt(10); 
        
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        System.out.println("What is " + number1 + " - " + number2 + "?");
        
        Scanner scanner = new Scanner(System.in);
        int studentAnswer = scanner.nextInt();
        
        int correctAnswer = number1 - number2;
        
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }
        
        scanner.close();
    }
}

