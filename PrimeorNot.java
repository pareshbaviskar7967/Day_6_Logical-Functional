import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int no = sc.nextInt();
        int flag = 0;
        if (no == 1) {
            flag = 1;
        } else if (no == 2) {
            flag = 1;
        } else {
            for (int p = 2; p < no; p++) {
                if (no % p == 0)
                    flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime");
    }
}