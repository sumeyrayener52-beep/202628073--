package Midterm;

public class Main {
    public static void main(String[] args) {
        int attend = 85, report = 75, age = 30;
        int salary = 6000, licenseYears = 2, score = 85;
        boolean cheating = false, debt = true;
        boolean drunk = false;

        boolean q1 = attend >= 80 && report >= 70 && !cheating;
        boolean q2 = age >= 25 && age < 40 && salary >= 5000 && debt;
        boolean q3 = age >= 21 && licenseYears >= 1 && !drunk;
        boolean q4 = (score >= 80 && score < 90) || score == 100;
        String q5 = (age >= 18 && score >= 80) ? "합격"
                : (age < 18 || score < 50) ? "불합격" : "재시험";

        System.out.println("문제 1 : " + q1);
        System.out.println("문제 2 : " + q2);
        System.out.println("문제 3 : " + q3);
        System.out.println("문제 4 : " + q4);
        System.out.println("문제 5 : " + q5);
    }
}