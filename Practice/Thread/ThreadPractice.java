package Practice.Thread;

public class ThreadPractice extends Thread {

    private String name;

    public ThreadPractice(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(name + " executing task: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        ThreadPractice thread1 = new ThreadPractice("Thread A");
        ThreadPractice thread2 = new ThreadPractice("Thread B");

        thread1.start();
        thread2.start();
    }
}
