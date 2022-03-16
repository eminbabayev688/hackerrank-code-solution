package az.hackerrank.javaExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int x = sc.nextInt();
        int y = sc.nextInt();
            try {
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }catch (InputMismatchException e){
            String message = e.toString();
            System.out.println(message.substring(0,32));
        }
    }
}
