// Sequential processing (Single-threaded)
public class SequentialProcessing {
    public static void main(String[] args) {
        processTask("Task 1");
        processTask("Task 2");
    }

    public static void processTask(String taskName) {
        System.out.println(taskName + " started");
        try {
            Thread.sleep(2000); // Simulate time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed");
    }
}

// Multithreaded processing
public class MultithreadedProcessing {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> processTask("Task 1"));
        Thread t2 = new Thread(() -> processTask("Task 2"));

        t1.start();
        t2.start();
    }

    public static void processTask(String taskName) {
        System.out.println(taskName + " started");
        try {
            Thread.sleep(2000); // Simulate time-consuming task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " completed");
    }
}
