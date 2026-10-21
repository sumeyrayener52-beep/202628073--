
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    final int HEART = 65; // Symbolic constant
    final int DayofYear = 365;

    System.out.print("몇년동안 사셨습니까?");
    age = keyboard.nextInt();

    int day = age * DayofYear;
    int hour = day * 24;
    long minute = hour * 60L;

    long count = minute * HEART;

    System.out.printf("사람은 평균 분당 %d회 심장이 박동한다.\n", HEART);
    System.out.printf("심장은 %d년 동안 박동한 횟수는 %,d 입니다.\n", age, count);
}
