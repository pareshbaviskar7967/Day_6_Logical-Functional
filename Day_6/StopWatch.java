import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start time : ");
        int a = sc.nextInt();
        long start = System.currentTimeMillis();

        System.out.println("Enter the end time : ");
        int b = sc.nextInt();
        long now = System.currentTimeMillis();

        double cal = ((now - start) / 1000.0);

        System.out.println("The elapsed time was : " + cal);
    }
}