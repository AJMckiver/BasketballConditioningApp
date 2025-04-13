public class Workout {

    private String[] warmUp;
    private String[] exercises;
    private String[] coolDown;

    public Workout() {
        this.warmUp = new String[]{
                "Jumping Jacks - 3 minutes",
                "Arm Circles - 1 minute",
                "Leg Swings - 1 minute each leg",
                "Lunges - 1 minute"
        };

        this.exercises = new String[]{
                "Push-ups - Repeat for 30 seconds",
                "Squats - Repeat for 30 seconds",
                "Lunges - Repeat for 30 seconds",
                "Plank - Hold for 30 seconds",
                "Jumping Jacks - Repeat for 30 seconds",
                "Burpees - Repeat for 30 seconds",
                "Mountain Climbers - Repeat for 30 seconds",
                "High Knees - Repeat for 30 seconds",
                "Tricep Dips - Repeat for 30 seconds",
                "Bicycle Crunches - Repeat for 30 seconds",
                "Running (Sprints) - Sprint for 30 seconds, Rest for 30 seconds",
                "Running (Jogging) - Jog for 5 minutes"
        };

        this.coolDown = new String[]{
                "Stretching Hamstrings - 1 minute",
                "Quadriceps Stretch - 1 minute each leg",
                "Chest Stretch - 1 minute",
                "Shoulder Stretch - 1 minute"
        };
    }

    public String[] getWarmUp() {
        return warmUp;
    }

    public String[] getExercises() {
        return exercises;
    }

    public String[] getCoolDown() {
        return coolDown;
    }

    // Method to simulate a timer for exercises
    public void runTimer(String exercise) {
        // Extract time from exercise string
        int duration = 0;
        if (exercise.contains("30 seconds")) {
            duration = 30;
        } else if (exercise.contains("1 minute")) {
            duration = 60;
        } else if (exercise.contains("5 minutes")) {
            duration = 300; // For jogging, 5 minutes = 300 seconds
        }

        // Start timer
        System.out.println("Starting " + exercise);
        for (int i = duration; i > 0; i--) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
            System.out.println("Time left: " + i + " seconds");
        }
        System.out.println("Finished " + exercise);
    }
}