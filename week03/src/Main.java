//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    byte test = 127;
    byte value = (byte)(test + 1);

    System.out.printf("%d + 1 = %d\n", test, value);

    System.out.printf("%d + 1 = %d\n", test, test + 1);
}
