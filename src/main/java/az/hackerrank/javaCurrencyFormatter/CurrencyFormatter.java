package az.hackerrank.javaCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        Locale india = new Locale("en", "In");
        Locale china = new Locale("zh", "CN");
        Locale france = new Locale("fr", "FR");

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

        System.out.println("US: " + defaultFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}
