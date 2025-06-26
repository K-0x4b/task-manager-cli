public class Task {

    // Unique identifier for the task
    private int id;
    // Title of the task
    private String title;
    // Detailed description of the task
    private String description;
    // Due date in YYYY-MM-DD format
    private String dueDate;
    // Priority of the task (1-5)
    private int priority;
    // Status of the task: true if completed, false otherwise
    private boolean completed;

    // Constructor to initialize a new Task object
    public Task(int id, String title, String description, String dueDate, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.completed = false; // New tasks are not completed by default
    }

    // Getter for task ID
    public int getId() {
        return id;
    }

    // Setter for task ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for task title
    public String getTitle() {
        return title;
    }

    // Setter for task title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for task description
    public String getDescription() {
        return description;
    }

    // Setter for task description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for due date
    public String getDueDate() {
        return dueDate;
    }

    // Setter for due date
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Getter for priority
    public int getPriority() {
        return priority;
    }

    // Setter for priority
    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Getter for completed status
    public boolean isCompleted() {
        return completed;
    }

    // Setter for completed status
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Returns a string representation of the task for display
    @Override
    public String toString() {
        return "Task ID: " + id +
                "\nTitle: " + title +
                "\nDescription: " + description +
                "\nDue Date: " + dueDate +
                "\nPriority: " + priority +
                "\nCompleted: " + (completed ? "Yes" : "No") +
                "\n";
    }
}