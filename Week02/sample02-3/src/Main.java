import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    int radius;
    double 원의면적;

    System.out.print("원의 반지름 입력(정수형)? ");
    radius = keyboard.nextInt();

    원의면적 = 3.141592 * radius * radius;

    System.out.printf("원의 반지름 : %d Cm, 원의면적 : %.2f", radius, 원의면적);
}