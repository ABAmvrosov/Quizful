package net.aab.Quizful;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"UnnecessaryLocalVariable",
                   "WhileLoopReplaceableByForEach",
                   "UnnecessaryBoxing",
                   "unchecked"})
public class NonTypeCollection {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> ar = new ArrayList<>();
            List temp = ar;
            temp.add(new java.util.Date());
            temp.add(new Float(1.66));
            Iterator it = ar.iterator();
            while (it.hasNext())
                System.out.println(it.next());
            System.out.println(ar.get(0));
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
