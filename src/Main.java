import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit amount ($): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate (e.g. 7.25): ");
        double interestrate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        int dayperyear = 365;
        double dailyrate = (interestrate / 100) / dayperyear;
        int totaldays = dayperyear * years;

        double futurevalue = principal * Math.pow(1 + dailyrate, totaldays);
        double totalinterest = futurevalue - principal;

        System.out.println("Future Value: " + currency.format(futurevalue));
        System.out.println("Total Interest Earned: " + currency.format(totalinterest));

        if (interestrate < 4) {
            System.out.println("The average rate of a CD is 4.25%");
            System.out.println("I would recommend looking online for better rates.");
        }
    }
}
