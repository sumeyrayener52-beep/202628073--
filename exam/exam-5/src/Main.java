package Midterm;

public class Main {
    public static void main(String[] args) {
        double cost = 1015000;
        double profitRate = 0.3;
        double taxRate = 0.1;

        double price = cost * (1 + profitRate);
        double salesTax = price * taxRate;
        double purchaseTax = cost * taxRate;
        double payTax = salesTax - purchaseTax;

        System.out.printf("정가 : %,.0f원\n", price);
        System.out.printf("매출 세액 : %,.0f원\n", salesTax);
        System.out.printf("매입 세액 : %,.0f원\n", purchaseTax);
        System.out.printf("납부 세액 : %,.0f원\n", payTax);
    }
}