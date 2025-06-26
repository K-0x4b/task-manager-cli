import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        boolean isWorking = true;

        int reponse = -1;

        while (isWorking) {

            printChoices();

            System.out.print("Choice: ");

            try {
                reponse = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1-5.");
                scanner.nextLine();
                continue;
            }

            switch (reponse) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();

                    // Validate due date format
                    String dueDate;
                    while (true) {
                        System.out.print("Enter task due date (YYYY-MM-DD): ");
                        dueDate = scanner.nextLine();
                        try {
                            java.time.LocalDate.parse(dueDate, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            break; // valid format
                        } catch (java.time.format.DateTimeParseException e) {
                            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
                        }
                    }

                    
                    int priority = -1;
                    while (true) {
                        try {
                            
                            System.out.print("Enter task priority (1-5): ");
                            priority = scanner.nextInt();
                            scanner.nextLine();
                            if (priority >= 1 && priority <= 5) {
                                break;
                            } else {
                                System.out.println("Priority must be between 1 and 5. Please try again.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number between 1-5.");
                            scanner.nextLine();
                        }
                    }

                    taskManager.addTask(title, description, dueDate, priority);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    taskManager.listTasks();
                    break;

                case 3:
                    System.out.print("Enter task ID to mark as completed: ");
                    int idToComplete;
                    try {
                        idToComplete = scanner.nextInt();
                        scanner.nextLine();
                        if (taskManager.markTaskCompleted(idToComplete)) {
                            System.out.println("Task marked as completed.");
                        } else {
                            System.out.println("Task not found with ID: " + idToComplete);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid task ID.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int idToDelete;
                    try {
                        idToDelete = scanner.nextInt();
                        scanner.nextLine();
                        if (taskManager.delteTask(idToDelete)) {
                            System.out.println("Task deleted successfully.");
                        } else {
                            System.out.println("Task not found with ID: " + idToDelete);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid task ID.");
                        scanner.nextLine();
                    }   
                    break;

                case 5:
                    System.out.println("Thanks for using the task manager");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1-5.");
                    break;
            }
        }

        scanner.close();
    }

    public static void printChoices() {
        System.out.println("Task Manager");
        System.out.println("1. Add Task");
        System.out.println("2. List Tasks");
        System.out.println("3. Mark Task Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");

    }

}