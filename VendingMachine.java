import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int nos = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int amount = sc.nextInt();
        int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

        for (int i = 0; i < notes.length; i++) {
            if (amount / notes[i] > 0) {
                nos = amount / notes[i];
                System.out.println(" ");
                System.out.print(nos + " notes of ");
                if (nos > 0) {
                    System.out.print(notes[i] + " is taken");

                    count = count + nos;
                }
                amount = amount % notes[i];
            }
        }
    }
}