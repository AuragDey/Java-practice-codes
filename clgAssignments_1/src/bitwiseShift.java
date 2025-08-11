import java.util.Scanner;

public class bitwiseShift {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = inp.nextInt();

        // Multiply by 2 using left shift
        int multiplied = num << 1;

        // Divide by 4 using right shift
        int divided = num >> 2;

        // Output results
        System.out.println("Multiplying " + num + " by 2 gives: " + multiplied);
        System.out.println("Dividing " + num + " by 4 gives: " + divided);

        inp.close();
    }
}