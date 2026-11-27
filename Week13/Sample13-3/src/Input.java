import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int readData(String message) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int radius = 0;

        while (true) {
            try {
                System.out.printf("%s를 입력 : ", message);
                radius = keyboard.nextInt();
                if (radius > 0)
                    break;
                else {
                    System.err.print("ERROR :  음수 아니야 ");
                    System.in.read();
                }
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.err.print("ERROR :  숫자가 아니야 ");
                System.in.read();
            }
        }
        return radius;
    }
}