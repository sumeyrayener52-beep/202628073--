import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);                 // 소수점을 . 으로 입력받기 위해

        double[] score = new double[7];           // 7명의 채점관 점수

        for (int i = 0; i < score.length; i++) {
            do {
                System.out.print((i + 1) + "번 채점관 점수(60.0 ~ 100.0) : ");
                score[i] = sc.nextDouble();
            } while (score[i] < 60.0 || score[i] > 100.0);
        }

        double max = score[0];
        double min = score[0];
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) max = score[i];  // 최고 점수
            if (score[i] < min) min = score[i];  // 최소 점수
            sum += score[i];
        }

        double average = (sum - max - min) / 5;  // 최고, 최소를 제외한 5명의 평균

        System.out.printf(Locale.US, "최고 점수 : %.1f%n", max);
        System.out.printf(Locale.US, "최소 점수 : %.1f%n", min);
        System.out.printf(Locale.US, "홍길동 선수의 최종 점수 : %.2f%n", average);

        sc.close();
    }
}