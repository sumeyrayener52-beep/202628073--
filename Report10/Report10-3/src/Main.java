import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ISBN 앞 12자리를 하이픈과 함께 입력 (예: 978-89-954321-0) : ");
        String input = sc.nextLine().trim();

        String digits = input.replace("-", "");          // 하이픈 제거
        if (digits.length() != 12) {
            System.out.println("오류: 숫자 12자리를 입력하세요.");
            return;
        }

        int[] num = new int[12];                         // ISBN 12자리 숫자
        int[] weight = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};   // 가중치 1과 3을 번갈아 적용
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            char ch = digits.charAt(i);
            if (ch < '0' || ch > '9') {
                System.out.println("오류: 숫자만 입력하세요.");
                return;
            }
            num[i] = ch - '0';
            sum += num[i] * weight[i];                   // 곱한 값의 합
        }

        int remainder = sum % 10;                        // 10으로 나눈 나머지
        int check = (remainder == 0) ? 0 : 10 - remainder;   // 체크 기호

        System.out.println("가중치를 곱한 합 : " + sum);
        System.out.println("10으로 나눈 나머지 : " + remainder);
        System.out.println("체크 기호 : " + check);
        System.out.println("유효성 확인 : " + sum + " + " + check + " = " + (sum + check)
                + " → 10으로 나눈 나머지 " + ((sum + check) % 10));
        System.out.println("완성된 ISBN : " + input + "-" + check);

        sc.close();
    }
}