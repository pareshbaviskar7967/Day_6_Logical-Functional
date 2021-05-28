import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month between 1 to 12");
        int month = sc.nextInt();
        System.out.println("Enter the year which is valid ");
        int year = sc.nextInt();
        System.out.println("Enter the date between 1 to 31");
        int date = sc.nextInt();

        int year0 = year - (14 - month) / 12;

        int x = year0 + (year0 / 4) - (year0 / 100) + (year / 400);

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int dateofday = (date + x + ((31 * m0) / 12)) % 7;

        System.out.println("Date: " + date + "   Month: " + month + "   Year: " + year);

        System.out.print("The day : ");

        switch (dateofday) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}