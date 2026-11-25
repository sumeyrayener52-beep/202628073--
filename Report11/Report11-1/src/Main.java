import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CLASSES = 2;       // 반의 수
        final int MAX = 10;          // 반 학생 최대 인원
        String[] subject = {"국어", "영어", "수학"};

        String[][][] student = new String[CLASSES][MAX][2];  // {학번, 이름}
        int[][][] score = new int[CLASSES][MAX][3];          // 국어, 영어, 수학
        int[][][] result = new int[CLASSES][MAX][3];         // 총점, 학급 등수, 학년 등수
        double[][] avg = new double[CLASSES][MAX];           // 평균
        int[] count = new int[CLASSES];                      // 반별 학생 수

        // 1. 입력
        for (int c = 0; c < CLASSES; c++) {
            do {
                System.out.print((c + 1) + "반 학생 수(1 ~ " + MAX + ") : ");
                count[c] = sc.nextInt();
            } while (count[c] < 1 || count[c] > MAX);

            for (int s = 0; s < count[c]; s++) {
                System.out.print("[" + (c + 1) + "반] " + (s + 1) + "번째 학생의 학번 : ");
                student[c][s][0] = sc.next();
                System.out.print("[" + (c + 1) + "반] " + (s + 1) + "번째 학생의 이름 : ");
                student[c][s][1] = sc.next();

                for (int k = 0; k < 3; k++) {
                    do {
                        System.out.print("[" + (c + 1) + "반] " + student[c][s][1]
                                + " 학생의 " + subject[k] + " 성적 : ");
                        score[c][s][k] = sc.nextInt();
                    } while (score[c][s][k] < 0 || score[c][s][k] > 100);
                    result[c][s][0] += score[c][s][k];       // 총점
                }
                avg[c][s] = result[c][s][0] / 3.0;           // 평균
                System.out.println();
            }
        }

        // 2. 등수 계산 (총점이 같으면 같은 등수)
        for (int c = 0; c < CLASSES; c++) {
            for (int s = 0; s < count[c]; s++) {
                int classRank = 1;
                int gradeRank = 1;
                for (int c2 = 0; c2 < CLASSES; c2++) {
                    for (int s2 = 0; s2 < count[c2]; s2++) {
                        if (result[c2][s2][0] > result[c][s][0]) {
                            gradeRank++;                     // 학년에서 나보다 총점이 높은 학생 수 + 1
                            if (c2 == c) classRank++;        // 같은 반에서 나보다 총점이 높은 학생 수 + 1
                        }
                    }
                }
                result[c][s][1] = classRank;
                result[c][s][2] = gradeRank;
            }
        }

        // 3. 출력 (학급 등수 순서로 정렬)
        String line = "*".repeat(60);
        for (int c = 0; c < CLASSES; c++) {
            int[] order = new int[count[c]];                 // 출력 순서를 저장하는 배열
            for (int s = 0; s < count[c]; s++) order[s] = s;

            for (int i = 0; i < count[c] - 1; i++) {         // 학급 등수 오름차순 정렬
                for (int j = 0; j < count[c] - 1 - i; j++) {
                    if (result[c][order[j]][1] > result[c][order[j + 1]][1]) {
                        int temp = order[j];
                        order[j] = order[j + 1];
                        order[j + 1] = temp;
                    }
                }
            }

            System.out.println((c + 1) + "반");
            System.out.println(line);
            System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t반석차\t학년석차");
            System.out.println(line);

            double avgSum = 0;
            for (int k = 0; k < count[c]; k++) {
                int s = order[k];
                System.out.printf(Locale.US, "%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d%n",
                        student[c][s][0], student[c][s][1],
                        score[c][s][0], score[c][s][1], score[c][s][2],
                        result[c][s][0], avg[c][s], result[c][s][1], result[c][s][2]);
                avgSum += avg[c][s];
            }
            System.out.println(line);
            System.out.printf(Locale.US, "\t학급 평균 : %.5f%n%n", avgSum / count[c]);
        }

        sc.close();
    }
}