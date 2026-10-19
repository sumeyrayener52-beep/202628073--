public class Main {
    public static void main(String[] args) {
        int totalSeconds = 54321;

        int hours = totalSeconds / 3600;          // 몇 시간
        int remain = totalSeconds % 3600;         // 남은 초
        int minutes = remain / 60;                // 몇 분
        int seconds = remain % 60;                // 최종 남은 초

        System.out.println(totalSeconds + " 초 = " + hours + " 시간 "
                + minutes + " 분 " + seconds + " 초");
    }
}