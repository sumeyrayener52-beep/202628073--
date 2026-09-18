import java.util.Scanner;

public class Report3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름은 ? ");
        String name = sc.nextLine();

        System.out.print(name + "님의 가족은 몇 명입니까 ? ");
        int count = sc.nextInt();

        sc.nextLine();

        System.out.print(name + "님의 가족은 어디에서 살지요 ? ");
        String city = sc.nextLine();

        System.out.println();
        System.out.println(name + "님의 가족은 " + count + "명 입니다.");
        System.out.println(name + "님의 가족은 " + city + "에서 살고 있습니다.");

        sc.close();
    }
}
