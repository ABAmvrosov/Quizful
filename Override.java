package net.aab.Quizful;

public class Override {
    public static void var (Integer x, int y) {
        System.out.println("Integer int");
    }

    public static void var (Object... x) {
        System.out.println("Object");
    }

    public static void var (int... x) {
        System.out.println("int... x");
    }

    public static void var (Integer... x) {
        System.out.println("Integer... x");
    }

    public static void main(String[] args) {
        int i = 0;
        Integer i2 = 123;
        var(i,i2);
    }
}
