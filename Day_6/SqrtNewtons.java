import java.util.Scanner;

public class SqrtNewtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non negative integer to find Sqrt : ");
        double c = sc.nextDouble();

        double epsilon = 1e-15;
        double t = c;

        while ((Math.abs(t - c / t)) > (epsilon * t)) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("The Sqrt netwon method value is: " + t);
    }
}