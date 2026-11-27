public class Output {

    protected void display(int[] score, int sum) {
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%s : %d 점\n",
                    Subject.values()[i], score[i]);
        }
        System.out.println("총점 : " + sum + " 점");
    }
}