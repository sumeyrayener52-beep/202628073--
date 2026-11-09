
    public class Main {
        public static void main(String[] args) {
            int pos = 0;   // cm
            int day = 0;

            while (true) {
                day++;
                pos += 55;                 //
                if (pos >= 300) break;     //
                pos -= 13;                 //
            }

            System.out.println(day + "일째 낮에 우물을 탈출합니다.");
            if (day <= 7) System.out.println("방울꽃이 시들기 전에 곁을 지킬 수 있습니다!");
            else          System.out.println("방울꽃이 시들어 버립니다...");
        }
    }
