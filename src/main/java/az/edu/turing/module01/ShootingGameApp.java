package az.edu.turing.module01;

import java.util.Random;
import java.util.Scanner;

public class ShootingGameApp {

    public static void main(String[] args) {
        char[][] matrix = initializeMatrix(5, 5);
        int[] target = generateTarget();

        System.out.println("All set. Get ready to game!");

        playGame(matrix, target);
        System.out.println("You have won!");
    }

    private static char[][] initializeMatrix(int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = '-';
            }
        }
        return matrix;
    }

    private static int[] generateTarget() {
        Random random = new Random();
        return new int[]{random.nextInt(5), random.nextInt(5)};
    }

    private static void playGame(char[][] matrix, int[] target) {
        Scanner scanner = new Scanner(System.in);
        boolean won = false;

        while (!won) {
            int row = getInput(scanner, "row", 1, 5);
            int col = getInput(scanner, "col", 1, 5);

            if (row == target[0] + 1 && col == target[1] + 1) {
                matrix[row - 1][col - 1] = 'x';
                won = true;
            } else {
                matrix[row - 1][col - 1] = '*';
            }

            printMatrix(matrix);
        }
    }

    private static int getInput(Scanner scanner, String type, int min, int max) {
        int value = -1;

        while (value < min || value > max) {
            System.out.printf("Enter the %s (%d-%d) to shoot: ", type, min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            value = scanner.nextInt();

            if (value < min || value > max) {
                System.out.printf("Invalid %s. Please enter a number between %d and %d.%n", type, min, max);
            }
        }

        return value;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
