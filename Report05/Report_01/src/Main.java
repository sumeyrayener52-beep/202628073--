import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 3개 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("모두 양수");
        } else if (!(a >= 0 && b >= 0 && c >= 0)) {   // 하나라도 음수
            System.out.println("음수 포함");
        } else if (a == 0 && b == 0 && c == 0) {
            System.out.println("모두 0");
        } else {
            System.out.println("음수는 없지만 0이 포함됨");
        }

        sc.close();
    }
}