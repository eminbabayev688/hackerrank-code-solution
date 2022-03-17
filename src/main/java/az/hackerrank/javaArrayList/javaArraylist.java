package az.hackerrank.javaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class javaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array List size:");
        int n= sc.nextInt();
        System.out.println("n="+n);
        ArrayList<List<Integer>> listOfLists= new ArrayList<List<Integer> >();

        for (int i = 1; i <=n; i++) {
            List<Integer> list1 = new ArrayList<Integer>();
            System.out.print("Enter list"+i+" size:");
            int d = sc.nextInt();
            System.out.println("d="+d);
            for (int j = 0; j < d; j++) {
                list1.add(sc.nextInt());
            }
            listOfLists.add(list1);
        }
        listOfLists.forEach(System.out::println);
        System.out.println("*****************");
        System.out.print("Enter q:");
        int q =sc.nextInt();
        System.out.println("q="+q);
        for (int i = 0; i < q; i++) {
            System.out.print("Enter number 1:");
            int num1 = sc.nextInt();
            System.out.println("num1="+num1);
            System.out.print("Enter number 2:");
            int num2= sc.nextInt();
            System.out.println("num2="+num2);
            try {
                System.out.println((listOfLists.get(num1-1)).get(num2-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
