import java.util.ArrayList;
import java.util.List;

public class Main { //점의 위치구하기
    class 점의위치구하기 {
        public int solution(int[] dot) {
            int x = dot[0];
            int y = dot[1];
            int answer = 0;
            if (x > 0) {
                answer = y > 0 ? 1 : 4;
            } else {
                answer = y > 0 ? 2 : 3;
            }
            return answer;
        }
    }
}
