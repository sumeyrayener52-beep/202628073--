import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    protected int[] readData(int length) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int[] score = new int[length];

        int i = 0;
        while (i < length) {
            try {
                System.out.printf("%s 성적 입력 : ", Subject.values()[i]);
                score[i] = keyboard.nextInt();
                if (score[i] >= 0 && score[i] <= 100)
                    i++;
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
        return score;
    }

}