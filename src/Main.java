import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Shared scanner for user input throughout the program
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a TaskManager instance to manage all tasks
        TaskManager taskManager = new TaskManager();
        boolean isWorking = true; // Controls the main loop

        int response = -1; // Stores the user's menu choice

        // Main program loop
        while (isWorking) {

            printChoices(); // Show menu options

            System.out.print("Choice: ");

            try {
                // Read the user's menu choice
                response = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline
            } catch (InputMismatchException e) {
                // Handle non-integer input gracefully
                System.out.println("Invalid input. Please enter a number between 1-5.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            // Handle the user's menu choice
            switch (response) {
                case 1:
                    // Add a new task with user input
                    addTaskWithInput(taskManager);
                    break;
                    
                case 2:
                    // List all tasks
                    taskManager.listTasks();
                    break;

                case 3:
                    // Mark a task as completed by ID
                    System.out.print("Enter task ID to mark as completed: ");
                    int idToComplete;
                    try {
                        idToComplete = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (taskManager.markTaskCompleted(idToComplete)) {
                            System.out.println("Task marked as completed.");
                        } else {
                            System.out.println("Task not found with ID: " + idToComplete);
                        }
                    } catch (InputMismatchException e) {
                        // Handle invalid ID input
                        System.out.println("Invalid input. Please enter a valid task ID.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    // Delete a task by ID
                    System.out.print("Enter task ID to delete: ");
                    int idToDelete;
                    try {
                        idToDelete = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (taskManager.deleteTask(idToDelete)) {
                            System.out.println("Task deleted successfully.");
                        } else {
                            System.out.println("Task not found with ID: " + idToDelete);
                        }
                    } catch (InputMismatchException e) {
                        // Handle invalid ID input
                        System.out.println("Invalid input. Please enter a valid task ID.");
                        scanner.nextLine();
                    }   
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Thanks for using the task manager");
                    System.exit(0);
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice. Please enter a number between 1-5.");
                    break;
            }
        }

        scanner.close(); // Close the scanner when done
    }

    // Prints the main menu options to the user
    public static void printChoices() {
        System.out.println("Task Manager");
        System.out.println("1. Add Task");
        System.out.println("2. List Tasks");
        System.out.println("3. Mark Task Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
    }

    // Handles all user input for adding a new task
    public static void addTaskWithInput(TaskManager taskManager){
        // Prompt for task title
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        // Prompt for task description
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        // Validate due date format (YYYY-MM-DD)
        String dueDate;
        while (true) {
            System.out.print("Enter task due date (YYYY-MM-DD): ");
            dueDate = scanner.nextLine();
            try {
                // Try to parse the date to ensure correct format
                java.time.LocalDate.parse(dueDate, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                break; // Valid format, exit loop
            } catch (java.time.format.DateTimeParseException e) {
                // Inform user of invalid format and repeat
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }

        // Prompt for task priority and ensure it's between 1 and 5
        int priority = -1;
        while (true) {
            try {
                System.out.print("Enter task priority (1-5): ");
                priority = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (priority >= 1 && priority <= 5) {
                    break; // Valid priority, exit loop
                } else {
                    System.out.println("Priority must be between 1 and 5. Please try again.");
                }
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a number between 1-5.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        // Add the new task to the manager
        taskManager.addTask(title, description, dueDate, priority);
        System.out.println("Task added successfully!");
    }
}