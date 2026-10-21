void main() {
    Scanner keyboard = new Scanner(System.in);
    keyboard.useLocale(Locale.US);

    final float DON = 3.75f;  // 1 돈의 무게
    final int GOLD = 775000; // 금 1 돈의 가격
    float weight;

    System.out.print("당신의 몸무게는?");
    weight = keyboard.nextFloat(); // 45.6

    int weight1 = (int) weight; // 45
    float remainder = weight - weight1; // 0.6

    int gram = (int) (weight * 1000);
    double donofweight = gram / DON;
    double money = donofweight * GOLD;
    long money1 = (long) (money * 1000);
    money1 *= 1000;

    System.out.printf("%.1f kg = %,d gram\n", weight, gram);
    System.out.printf("%.1f kg = %,.2f 돈\n", weight, donofweight);
    System.out.printf("%.1f kg = %,.0f원 (금 1 돈 가격 = %,d원)\n", weight, (double) money1, GOLD);
}
