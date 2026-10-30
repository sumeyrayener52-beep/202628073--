
package Midterm;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);

        double time;

        System.out.println("**** 시간 계산 ****");
        System.out.print("시간 입력 : ");
        time = keyboard.nextDouble();

        int day = (int) (time / 24);
        int hour = (int) (time - day * 24);

        double rest = time - day * 24 - hour;

        int minute = (int) (rest * 60);
        int second = (int) ((rest * 60 - minute) * 60);

        System.out.println();

        System.out.println(time + " 시간은 " + day + " 일 " + hour
                + " 시간 " + minute + " 분 " + second + " 초 입니다");
    }
}
