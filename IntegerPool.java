package net.aab.Quizful;

public class IntegerPool {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Integer i1 = 1200;
        Integer i2 = 1200;
        Integer i3 = 120;
        Integer i4 = 120;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }
}
