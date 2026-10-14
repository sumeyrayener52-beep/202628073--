public class Main {
    public static void main(String[] args) {
        int a, b, c;

        // 1. İşlem
        a = 3;
        b = 4;
        c = --a + b--;
        System.out.printf("a=%d, b=%d, c=%d%n", a, b, c);

        // 2. İşlem
        a = 3;
        b = 4;
        c = a-- + ++b;
        System.out.printf("a=%d, b=%d, c=%d%n", a, b, c);
    }
}