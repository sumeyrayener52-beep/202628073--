//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public static int readData() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int radius = 0;

    while (true) {
        try {
            System.out.print("원의 반지를 입력 : ");
            radius = keyboard.nextInt();
            if (radius > 0)
                break;
            else {
                System.err.print("ERROR :  음수 아니야 ");
                System.in.read();
            }
        } catch (InputMismatchException e) {
            keyboard.nextLine();
            System.err.print("ERROR :  숫자가 아니야 ");
            System.in.read();
        }
    }
    return radius;
}

double circleArea(int r) {
    double area;

    area = Math.PI * r * r;
    return area;
}


// Method Overloading (중복 정의)
void display(String title, int value) {
    System.out.printf("%s : %,d Cm\n", title, value);
}

void display(String title, double value) {
    System.out.printf("%s : %,.2f \u33a0\n", title, value);
}

void main() throws IOException {
    int radius;
    double area;

    radius = readData();

    area = circleArea(radius);

    display("원의 반지름", radius);
    display("원의 면적", area);
}