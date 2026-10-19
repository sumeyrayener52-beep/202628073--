import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구매 금액 : ");
        int amount = sc.nextInt();

        System.out.print("멤버십 회원입니까? (Y/N) : ");
        boolean isMember = sc.next().equalsIgnoreCase("Y");

        if (amount < 0) {
            System.out.println("오류: 구매 금액은 음수일 수 없습니다.");
        } else if (amount >= 50000 || (isMember && amount >= 30000)) {
            System.out.println("무료배송 적용");
        } else {
            System.out.println("무료배송 아님");
        }

        sc.close();
    }
}