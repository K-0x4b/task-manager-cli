import java.util.ArrayList;

public class TaskManager {

    // This list will store all the tasks the user creates
    public ArrayList<Task> tasks;
    // This keeps track of the next unique ID to assign to a new task
    public int nextId;

    // When you make a new TaskManager, start with an empty list and ID 1
    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1; // Start IDs from 1 so it's more user-friendly
    }

    // Add a new task with the given details. The ID is set automatically.
    public void addTask(String title, String description, String dueDate, int priority) {
        Task task = new Task(nextId, title, description, dueDate, priority);
        nextId++; // Make sure the next task gets a new ID
        tasks.add(task); // Actually add the task to our list
    }

    // Print out all tasks, or let the user know if there aren't any
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task); // Uses the Task's toString method
            System.out.println("--------------------------------------------------");   
        }
    }

    // Mark a task as completed by its ID. Return true if successful.
    public boolean markTaskCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true); // Set the completed flag to true
                return true; // Found and marked
            }
        }
        return false; // No task with that ID
    }

    // Remove a task by its ID. Return true if a task was removed.
    public boolean deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task); // Remove the task from the list
                return true; // Found and deleted
            }
        }
        return false; // No task with that ID
    }

    // Find a task by its ID and return it, or return null if not found
    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task; // Found it!
            }
        }
        return null; // Didn't find it
    }

    
}