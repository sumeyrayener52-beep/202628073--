public class Compute {

    protected static int calcTotal(int[] score) {
        int sum = 0;

        for (int i = 0; i < score.length; i++)
            sum += score[i];

        return sum;
    }
}