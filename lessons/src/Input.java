import java.util.Scanner;

public class Input {
    public static void main (String[] arg) {

        Scanner mySc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String m = mySc.nextLine();
        System.out.println("Your message is: " + m);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = s.nextInt();
        System.out.println("Your number is: " + n);

    }
}