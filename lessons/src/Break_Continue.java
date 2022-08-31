public class Break_Continue {
    public static void main(String[] arg) {
        int v = 0;
        int n = 0;

        while (true) {
            v++;
            System.out.println("here is an odd or even number: " + v);
            if (v == 17) {
                break;
            }
        }

        while (n <= 20) {
            if (n % 2 == 1) {
                n++;
                continue;
            }
            System.out.println("it's an even number: " + n);
            n++;
        }
        System.out.println("You have exited a program");


    }
}
