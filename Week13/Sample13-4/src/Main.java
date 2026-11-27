import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] score;
        int sum;

        score = Input.readData(Subject.values().length);

        sum = Compute.calcTotal(score);

        Output.display(score, sum);
    }
}