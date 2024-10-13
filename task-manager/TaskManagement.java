import java.util.ArrayList;
import java.util.PriorityQueue;

class Task implements Comparable<Task>{
    String description;
    int priority;

    public Task(String description, int priority){
        this.description = description;
        this.priority = priority;
    }

    public int compareTo(Task other){
        return this.priority - other.priority;
    }

    public String toString(){
        return "Task: " + description + ", Priority: " + priority;
    }
}

 class TaskManager{
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();

    public void addTask(String description, int priority){
        Task task = new Task(description, priority);
        taskQueue.add(task);
    }

    public void viewTasks(){
        for(Task task: taskQueue){
            System.out.println(task);
        }
    }

    public void removeTask(){
        if(!taskQueue.isEmpty()){
            System.out.println("Removing highest priority task: " + taskQueue.poll());
        }
    };
}

public class TaskManagement{
    public static void main(String[] args){
        TaskManager manager = new TaskManager();
        manager.addTask("Finish workout", 2);
        manager.addTask("Run in morning", 1);
        manager.addTask("Say hello", 3);
        System.out.println("All tasks: ");
        manager.viewTasks();
        manager.removeTask();
        System.out.println("Remaining tasks: ");
        manager.viewTasks();
    }
}