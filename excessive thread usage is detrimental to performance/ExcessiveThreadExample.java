public class ExcessiveThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started");
                try {
                    Thread.sleep(2000); // Simulate task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completed");
            });
            thread.start();
        }
    }
}
