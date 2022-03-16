package az.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                System.out.println(x / y);
            } catch (ArithmeticException mess) {
                System.out.println(mess);
            }
        }catch (InputMismatchException mess){
            String message = mess.toString();
            System.out.println(message.substring(0,32));
        }
    }
}