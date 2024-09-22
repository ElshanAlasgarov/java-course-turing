package az.edu.turing.module01;

import java.util.Scanner;

public class WeekPlannerApp {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "team meeting";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to the gym";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "shopping";
        schedule[5][0] = "Friday";
        schedule[5][1] = "finish project report";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "visit family";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please, input the day of the week: ");
            String inputDay = scanner.nextLine().trim().toLowerCase();

            if (inputDay.equals("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            boolean validDay = false;
            for (int i = 0; i < schedule.length; i++) {

                if (inputDay.equals(schedule[i][0].toLowerCase())) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1] + ".");
                    validDay = true;
                    break;
                }
            }

            if (!validDay) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

        scanner.close();
    }
}
