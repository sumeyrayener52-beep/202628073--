
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double area;

    while (true) {
        System.out.print("원의 반지를 입력 : ");
        radius = keyboard.nextInt();
        if (radius > 0)
            break;
        else {
            System.err.print("ERROR :  음수 아니야 ");
            System.in.read();
        }
    }

    area = Math.PI * radius * radius;

    System.out.printf("원의 반지름 : %,d Cm\n", radius);
    System.out.printf("원의 면적 : %,.2f \u33a0\n", area);
}