package az.hackerrank.javaTagContentExtractor;

import java.util.Scanner;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text:");
        String textStr = "<h1><a>contents</a>invalid</h1>";
        int textStrLen = textStr.length();
        String str="";
        str = str + Character.toString(textStr.charAt(0));

        System.out.println(str);
        System.out.println(textStr);
        System.out.println(textStr.indexOf("<h1>"));

        for (int i = 0; i < textStrLen; i++) {
            System.out.println(textStr.charAt(i));
        }

        double payment = sc.nextDouble();

    }
}
