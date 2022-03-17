package az.hackerrank.javaIfElse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1){
            System.out.print("Weird");
        }else if(n%2==0 && n>1 && n<6){
            System.out.print("Not Weird");
        }else if(n%2==0 && n>5 && n<21){
            System.out.print("Weird");
        }else if(n%2==0 && n>20){
            System.out.print("Not Weird");
        }
    }
}
