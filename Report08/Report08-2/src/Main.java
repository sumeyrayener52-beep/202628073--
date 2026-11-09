public class Main {
    public static void main(String[] args) {
        // 1) for
        for (int c = 0; c <= 37; c++) {
            int d = 37 - c;
            if (2 * c + 4 * d == 102)
                System.out.println("[for] 닭: " + c + ", 개: " + d);
        }

        // 2) while
        int c = 0;
        while (c <= 37) {
            int d = 37 - c;
            if (2 * c + 4 * d == 102)
                System.out.println("[while] 닭: " + c + ", 개: " + d);
            c++;
        }

        // 3) do-while
        int c2 = 0;
        do {
            int d = 37 - c2;
            if (2 * c2 + 4 * d == 102)
                System.out.println("[do-while] 닭: " + c2 + ", 개: " + d);
            c2++;
        } while (c2 <= 37);
    }
}