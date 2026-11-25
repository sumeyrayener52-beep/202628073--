//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int TITLE = 0;
    final int AUTHOR = 1;
    String[][] book = new String[][]{
            {"어서와 JAVA는 처음이지", "천인국"},
            {"쉽게 배우는 자료구조", "윤병로"}};
    int[] pages = new int[]{230, 330};
    float[] price = new float[]{28000.0f, 32000.0f};

    for (int i = 0; i < book.length; i++) {
        System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n\n",
                book[i][TITLE], book[i][AUTHOR], pages[i], price[i]);
    }
}