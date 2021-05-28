import java.util.Scanner;

class ReversedNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int no = sc.nextInt();

        int rev = 0;

        while (no != 0) {

            int digit = no % 10;
            rev = rev * 10 + digit;
            no /= 10;
        }
        System.out.println("Reversed Number : " + rev);
    }
}