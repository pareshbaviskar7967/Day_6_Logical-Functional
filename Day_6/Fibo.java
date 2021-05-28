import java.util.Scanner;

class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No : ");
        int no = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i <= no; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}