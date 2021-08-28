public class multithreading extends Thread {
    public void run() {
        while (true)
            System.out.println("XXXXXXXXX");
    }

    public static void main(String[] args) {
        multithreading m = new multithreading();
        m.start();

        ;

        while (true) {
            System.out.println("YYYYYYYYYYYYYY");
        }
    }

}
