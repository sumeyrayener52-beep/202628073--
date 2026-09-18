//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int 사각형면적;
    double radius;
    double 원의면적;
    final double PI= 3.141592;
    double area;

    System.out.print("정사각형의 한번의 길이 입력 (예 5)");
    base = keyboard.nextInt();

    사각형면적= base* base;
    radius= base/2.0;
    원의면적=PI* radius*radius;
    area= 사각형면적 - 원의면적;

    System.out.printf("입력한 변의 길이가 %d ㎠인 정사각형의 면적은 %,d ㎠\n", base, 사각형면적);
    System.out.printf("반지름이 %,.2f ㎠인 원의 면적은 %,.2f ㎠\n", radius, 원의면적);
    System.out.printf("구하는 면적 : %.2f ㎠\n", area);

}
