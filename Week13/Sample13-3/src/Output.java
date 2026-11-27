public class Output {
    // Method Overloading (중복 정의)
    static void display(String title, int value) {
        System.out.printf("%s : %,d Cm\n", title, value);
    }

    static void display(String title, double value) {
        System.out.printf("%s : %,.2f \u33a0\n", title, value);
    }
}