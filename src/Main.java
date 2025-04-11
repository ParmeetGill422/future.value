import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter deposit amount($):");
        double principal = scanner.nextDouble();

        System.out.println("Enter interest rate (e.g. 7.25%:");
        double interestrate = scanner.nextDouble() /100;

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        int dayperyear = 365;
        double dailyrate = interestrate / dayperyear;
        int totaldays = dayperyear * years;

        double futurevalue = principal * Math.pow(1 + dailyrate, totaldays);
        double totalinterest = futurevalue - principal;

        System.out.println("Future Value: " + currency.format(futurevalue));
        System.out.println("Total interest Earned: " + currency.format(totaldays));



        }

    }