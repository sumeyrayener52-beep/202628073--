
package Midterm;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int age, fee;

        System.out.println("**** 체육관 입장료 계산 ****");
        System.out.print("\t\t나이 : ");
        age = keyboard.nextInt();

        fee = (age >= 18) ? 4000
                : (age >= 13) ? 3000
                : (age >= 7) ? 1000 : 0;

        if (fee == 0) {
            System.out.println("\t\t요금 : 무료");
        } else {
            System.out.printf("\t\t요금 : %,d원\n", fee);
        }
    }
}
