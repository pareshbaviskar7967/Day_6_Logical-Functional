import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double celsius = sc.nextDouble();

        System.out.println("Enter the temperature in fahrenheit ");
        double fahrenheit = sc.nextDouble();

        double celstoFah = (celsius * 9 / 5) + 32;
        System.out.println("The celsius to fahrenheit temperature is: " + celstoFah);

        double fahtoCels = (fahrenheit - 32) * 5 / 9;
        System.out.println("The fahrenheit to celsius temperature is: " + fahtoCels);
    }
}