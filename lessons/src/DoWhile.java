import java.util.Scanner;

public class DoWhile {
    public static void main (String[] arg){
        Scanner s = new Scanner(System.in);
        int v;
        do{
            System.out.print("Enter number 5 to stop a program: ");
            v= s.nextInt();
        }while (v!=5);


        System.out.print("Congrats you entered "+v+" and stopped a program");



    }
}
