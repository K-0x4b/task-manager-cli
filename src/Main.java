import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        int reponse = -1;

        while (isWorking) {

            printChoices();

            System.out.print("Choice: ");

            try {
                reponse = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e);
            }

            switch (reponse) {
                case 1:
                    
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Thanks for using the task manager");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter anumber between 1-5");
                    break;
            }
        }
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