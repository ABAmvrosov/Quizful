package net.aab.Quizful;

class MyThread extends Thread {
    public void run() {
        System.out.println("Running ");
    }
    public void start() {
        System.out.println("Staring ");
    }
}
public class Threads001 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
