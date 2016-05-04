package net.aab.Quizful;

import java.util.ArrayList;

@SuppressWarnings("InstantiatingObjectToGetClassObject")
public class getClassCompare {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
