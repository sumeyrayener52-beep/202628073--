import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 몸무게(kg)를 입력하세요 : ");
        double weight = sc.nextDouble();

        double moon = weight * 0.165;   // 달 중력 = 지구의 16.5%

        System.out.printf("지구에서의 몸무게 : %.1f kg%n", weight);
        System.out.printf("달에서의 몸무게   : %.1f kg%n", moon);

        sc.close();
    }
}