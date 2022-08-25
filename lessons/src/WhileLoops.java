public class WhileLoops {
    public static void main(String[] arg) {
        int myInt = 0;
        byte myByte = 10;

        while (myInt<5){
            System.out.println("Hello there!!! "+ myInt);
            myInt=myInt+1;
        }

        while (7<myByte) {
            System.out.println(myByte);
            myByte++;

            if (myByte == 20) {
                break;
            }
        }
    }
}
