import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("직육면체 가로 세로 높이 입력: ");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int height = scanner.nextInt();

        int vol = width * length * height;

        System.out.println("직육면체 가로 = " + width + " Cm");
        System.out.println("직육면체 세로 = " + length + " Cm");
        System.out.println("직육면체 높이 = " + height + " Cm");
        System.out.println("직육면체 부피 = " + vol + " Cm³");

        scanner.close();
    }
}