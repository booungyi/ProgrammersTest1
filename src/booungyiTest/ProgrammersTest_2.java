package booungyiTest;

import java.util.Scanner;

public class ProgrammersTest_2 {


    public static String solution(String my_string, String letter) {
        String answer = my_string;
        //@todo 문자열 my_string 과 문자 letter이 매개변수로 주어집니다
        // my_Streing 에서 letter 를 제거한 문자열을 return 하도록 solution 함수를 완성해주세요.
        return answer.replace(letter,"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next(), sc.next()));
    }
    //Todo String.replace(old words, new words) oldwords 인 글자들을 new word 로 교체해줌
    //TOdo ex) abcdefghi .replace(a , "" ) =>  bcdefghi
}
