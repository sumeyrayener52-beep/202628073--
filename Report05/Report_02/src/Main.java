import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("0 ~ 100 사이의 점수를 입력하세요.");
            sc.close();
            return;
        }

        String grade;
        if (score < 60) {
            grade = "F";
        } else {
            int s = Math.min(score, 99);                 // 100점도 A+가 되도록
            char letter = (char) ('A' + (9 - s / 10));   // ASCII: 90대→A, 80대→B, 70대→C, 60대→D
            String sign = (s % 10 >= 5) ? "+" : "0";     // 일의 자리가 5 이상이면 +
            grade = "" + letter + sign;
        }

        System.out.println("입력 점수 : " + score);
        System.out.println("학점 : " + grade);

        sc.close();
    }
}