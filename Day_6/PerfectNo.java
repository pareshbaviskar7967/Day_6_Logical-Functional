import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int no = sc.nextInt();
        int i = 1;
        while (i <= no / 2) {
            if (no % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == no) {
            System.out.println(no + " is a perfect number");
        } else
            System.out.println(no + " is not a  perfect number");
    }
}