public class MultithreadingScenario {
    public static void main(String[] args) {
        System.out.println("Scenario 1: File downloading (use multithreading)");
        Runnable downloadTask = () -> {
            System.out.println(Thread.currentThread().getName() + " downloading file...");
            try {
                Thread.sleep(2000); // Simulate download time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " download complete!");
        };
        new Thread(downloadTask, "Downloader 1").start();
        new Thread(downloadTask, "Downloader 2").start();

        System.out.println("\nScenario 2: File reading and word counting (use sequential)");
        System.out.println("Reading file...");
        // Simulated file reading
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counting words...");
    }
}
