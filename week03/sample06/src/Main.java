//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String name= "홍길동";
    float height= 170.6f;
    double weight= 67.5;
    int age = 21;
    char gender= '남';

    System.out.printf("%s의  키는%.1f cm 입니다.\n", name, height);
    System.out.printf("%s의  몸무게는 %.1fkg  입니다.\n", name, weight);
    System.out.printf("%s의  나이는 %d살  입니다.\n", name, age);
    System.out.printf("%s은 %c자 입니다.\n", name, gender);
}
