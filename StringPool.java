package net.aab.Quizful;

import java.util.Objects;

public class StringPool {
    public static void main(String[] args) {
        String strA = "test";
        String strB = "test";
        strA += "1";
        strB += "1";
        System.out.println(strA != strB);
        strA = "test1";
        strB = "test1";
        System.out.println(strA != strB);
     }

}
