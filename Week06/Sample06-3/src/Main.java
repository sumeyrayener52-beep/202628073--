
void main() {
    final int radius = 6400;
    final float PI = 3.141592f;
    final int KOREA = 100505;

    double surface = 4 * PI * radius * radius;

    double ratio = KOREA / surface * 100;

    System.out.printf("지구의 반지름 %.0f km, 표면적 %,.2f km²\n", (double) radius, surface);
    System.out.printf("대한민국 면적 %,d km²은 %.2f %% 입니다.\n", KOREA, ratio);
}
