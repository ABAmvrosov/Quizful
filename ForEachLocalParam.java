package net.aab.Quizful;

public class ForEachLocalParam {
    public static void main(String[] args) {
        int[] array = {1, 2};
//        int x; // must be declared in for-each loop
        for (int x : array) {
            System.out.println(x);
        }
    }
}
