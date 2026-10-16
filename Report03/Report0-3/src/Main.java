import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("섭씨 온도를 입력하세요 (℃): ");
    double celsius = scanner.nextDouble();

    double fahrenheit = celsius * 1.8 + 32.0;

    System.out.println("-");
    System.out.printf("섭씨 %.1f℃는 화씨 %.1f°F입니다.%n", celsius, fahrenheit);

}