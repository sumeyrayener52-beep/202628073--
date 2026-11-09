import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("초기 높이 X(m)를 입력하세요: ");
        double h = sc.nextDouble();
        double total = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("공의 %d번째 낙하 높이: %.4f m%n", i, h);
            if (i == 1) total += h;
            else        total += 2 * h;
            h = h * 2 / 3;
        }
        System.out.printf("총 이동 거리: %.4f m%n", total);
    }
}