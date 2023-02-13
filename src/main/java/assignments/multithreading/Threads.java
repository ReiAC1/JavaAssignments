package assignments.multithreading;

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        Thread printEvens = new Thread(() ->{
            try {
                for (int i = 0; i <= 50; i += 2) {
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread printOdds = new Thread(() ->{
            try {
                for (int i = 1; i <= 50; i += 2) {
                    System.out.println(50 - i);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        printEvens.start();
        printOdds.start();

        printEvens.join();
        printOdds.join();
    }
}
