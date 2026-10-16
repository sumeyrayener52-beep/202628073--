import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름 : ");
        int radius = scanner.nextInt();

        // 계산식
        double boxArea = (radius * 2.0) * (radius * 2.0); // 정사각형 면적 (2r * 2r)
        double circleArea = radius * radius * Math.PI;    // 원의 면적 (r * r * Math.PI)
        double area = boxArea - circleArea;               // 구하는 면적

        System.out.println();
        System.out.println("정사각형 면적 : " + (int)boxArea + " Cm2");
        System.out.printf("원의 면적 : %.2f Cm2\n", circleArea);
        System.out.printf("구하는 면적 : %.2f Cm2\n", area);

        scanner.close();
    }
}