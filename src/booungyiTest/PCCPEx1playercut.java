package booungyiTest;

import java.time.LocalDate;

public class PCCPEx1playercut {
    private final String PREV = "prev";
    private final String NEXT = "next";
    public String solution(String video_len,String pos , String op_end, String[]commands , String op_start) {
        String answer = "";
        int videoint = Integer.parseInt(video_len.replace(":", "")); //영화의 총 시간
        int posint = Integer.parseInt(pos.replace(",", ""));
        int op_endint = Integer.parseInt(op_end.replace(",", ""));
        int op_strartint = Integer.parseInt(op_start.replace(",", ""));
        for (int i = 0; i < commands.length; i++) {
        if (commands[i].equals("next")) {
            if ((videoint - 10) > posint) {
                if (op_endint - 10 > posint) {
                    answer += answer.valueOf(videoint - posint);
                } else {
                    answer = op_end;
                }
            } else {
                return video_len;
            }
        } else if (commands[i].equals("prev")) {
            if (posint <= 10) {

                answer = "00:00";
            } else {
                answer = String.valueOf(posint-10);
            }

            }
        }
//        만약 2 12:30 - 40 이면 1190이 뜸 그래서 if (substring(:)12:"30" <(40)) 12:30 -40 -40
        //op_Start  <= 현재위치 <= op end 인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.
        //video_len  동영상의 길이를 나타내는 문자열
        //기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos
        //op_stat 오프닝 시작 시각을 나타내는 문자열
        //op_end 오프닝의 끝나는 시각을 나타내는 문자열
        //pos 현재위치 를 나타내는 문자열
        //commands 사용자의 입력을 나타내는 1차원 문자열 배열
        // commands = prev:  10 재생위치가 10초미만인경우 영상의 처음위치로 이동, 10초전으로 이동
        // commands = next: 재생위치를 현재위치에서 10초후로 이동 남은시간이 10초 미만일경우 영상의 마지막 위치로 이동
        // 동양상 위치를 "mm:SS" 형식으로 return;

        if () {

        }
        return answer;
    }
}

