void main() {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;

    System.out.print("이름을 입력하세요: ");
    name = keyboard.nextLine();

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    System.out.printf("이름: %s, 나이: %d\n", name, age);
}