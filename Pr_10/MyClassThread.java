import java.util.Scanner;

public class MyClassThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            MyClassThread ping = new MyClassThread();
            ping.setName("Ping");
            ping.start();
            MyClassThread pong = new MyClassThread();
            pong.setName("Pong");
            pong.start();
            System.out.println("Для продолжения введите 1");
            int num = in.nextInt();
            if (num != 1) break;
        }
    }
}
