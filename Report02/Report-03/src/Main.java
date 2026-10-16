import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름은? ");
        String name = scanner.next();

        System.out.print(name + "님의 가족은 몇 명입니까? ");
        int count = scanner.nextInt();

        System.out.print(name + "님의 가족은 어디에서 살지요? ");
        String location = scanner.next();

        System.out.println(name + "님의 가족은 " + count + "명 입니다.");
        System.out.println(name + "님의 가족은 " + location + "에서 살고 있습니다.");

        scanner.close();
    }
}