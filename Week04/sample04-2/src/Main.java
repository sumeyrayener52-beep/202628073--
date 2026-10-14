//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a = Integer.MAX_VALUE;
    long b = a + 1;     //Overflow
    long c = a +1L;     //Also can do with "Long"

    System.out.printf("a = %,d, b = %,d, c = %,d\n", a , b, c);
}