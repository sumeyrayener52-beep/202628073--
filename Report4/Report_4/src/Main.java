import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("판매금액 : ");
        int total = sc.nextInt();

        int tax = (int) Math.round(total / 11.0);   // 부가가치세 (10%)
        int price = total - tax;                     // 금액

        System.out.println(String.format(Locale.US, "금액 : %,d원", price));
        System.out.println(String.format(Locale.US, "세금 : %,d원", tax));

        sc.close();
    }
}