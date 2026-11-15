import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final int N = 10;
        String[] name = new String[N];       // 학생 이름
        double[] weight = new double[N];     // 몸무게
        double sum = 0;

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 학생 이름 : ");
            name[i] = sc.next();
            do {
                System.out.print((i + 1) + "번째 학생 몸무게(30.0 ~ 120.0 Kg) : ");
                weight[i] = sc.nextDouble();
            } while (weight[i] < 30.0 || weight[i] > 120.0);
            sum += weight[i];
        }

        double average = sum / N;            // 평균 몸무게

        int count = 0;                       // 평균 이상자 수
        for (int i = 0; i < N; i++) {
            if (weight[i] >= average) count++;
        }

        // 몸무게가 큰 순서대로 학생 번호(index)를 정렬
        int[] order = new int[N];
        for (int i = 0; i < N; i++) order[i] = i;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (weight[order[j]] > weight[order[i]]) {
                    int temp = order[i];
                    order[i] = order[j];
                    order[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.printf(Locale.US, "평균 몸무게 : %.1f Kg%n", average);
        System.out.printf(Locale.US, "평균 이상자의 비율 : %.1f%% (%d명 / %d명)%n", count * 100.0 / N, count, N);
        System.out.println("[몸무게 상위 2명]");
        for (int k = 0; k < 2; k++) {
            System.out.printf(Locale.US, "  %s : %.1f Kg%n", name[order[k]], weight[order[k]]);
        }
        System.out.println("[몸무게 하위 2명]");
        for (int k = N - 1; k >= N - 2; k--) {
            System.out.printf(Locale.US, "  %s : %.1f Kg%n", name[order[k]], weight[order[k]]);
        }

        sc.close();
    }
}