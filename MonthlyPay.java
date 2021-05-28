import java.util.Scanner;

public class MonthlyPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PRINCIPLE LOAN amount : ");
        double P = sc.nextDouble();
        System.out.print("Enter YEAR to pay off : ");
        double Y = sc.nextDouble();
        System.out.print("Enter Percent Interest Compounded monthly : ");
        double R = sc.nextDouble();
        double n = 12 * Y;

        double r = R / (12 * 100);

        double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));
        System.out.println("payment is: " + payment);
    }
}