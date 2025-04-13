import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Workout workout = new Workout();

        // Ask user for time frame (e.g., 3 weeks)
        System.out.println("Enter the number of weeks for your workout plan:");
        int weeks = scanner.nextInt();

        // Display the workout plan
        System.out.println("Your workout plan for " + weeks + " week(s):");

        // Loop through the weeks
        for (int i = 1; i <= weeks; i++) {
            System.out.println("\nWeek " + i + ":");

            // Loop through the 5 days of the week
            for (int day = 1; day <= 5; day++) {
                System.out.println("\nDay " + day + ":");

                // Display warm-up and start timer for warm-up exercises
                System.out.println("\nWarm-up:");
                for (String exercise : workout.getWarmUp()) {
                    System.out.println(exercise);
                    if (exercise.contains("30 seconds") || exercise.contains("1 minute") || exercise.contains("5 minutes")) {
                        workout.runTimer(exercise); // Start timer for timed exercises
                    }
                }

                // Display main workout and start timer for timed exercises
                System.out.println("\nMain Workout:");
                for (String exercise : workout.getExercises()) {
                    System.out.println(exercise);
                    if (exercise.contains("30 seconds") || exercise.contains("1 minute") || exercise.contains("5 minutes")) {
                        workout.runTimer(exercise); // Start timer for timed exercises
                    }
                }

                // Display cool-down and start timer for cool-down exercises
                System.out.println("\nCool-down:");
                for (String exercise : workout.getCoolDown()) {
                    System.out.println(exercise);
                    if (exercise.contains("30 seconds") || exercise.contains("1 minute") || exercise.contains("5 minutes")) {
                        workout.runTimer(exercise); // Start timer for timed exercises
                    }
                }
            }
        }

        scanner.close();
    }
}