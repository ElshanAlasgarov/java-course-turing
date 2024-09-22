package az.edu.turing.module01;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGameApp {
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(10);
        System.out.println(number);

        while (true) {

            System.out.println("Enter a number between 0 - 100 :");
            Scanner scanner = new Scanner(System.in);

            int inputNumber = scanner.nextInt();

            if (inputNumber == number) {
                System.out.println("Number found!");
                break;
            } else if (inputNumber < number) {
                System.out.println("Try a large number.");
            } else {
                System.out.println("Try a smaller number.");
            }

        }

    }
}
