package booungyiTest;

import java.util.*;

public class StackandQueue {
    //Todo Stack 은 java.utill.stack 클래스로 제공됨
    public static void main(String[] args) {
        Stack stack = new Stack();

        /*연산 복잡도
        *
        * push() 삽입
        * pop() 삭제
        * peek 읽기
        * search() 검색
        *
        *
        * */
        //Todo Queue 구현체 종류

        Queue queue1 = new ArrayDeque();
        // 배열을 기반으로 구현된 큐
        //삽입(offer() , add())
        //삭제(poll,remove())
        //읽기 peek()

        Queue queue2 = new LinkedList();
        // 연결 리스트를 기반으로 구현된 큐.
        //삽입 offer,add
        //삭제 poll,remove
        //읽기 peek

        Queue queue3 = new PriorityQueue();
        //힙 을 기반으로 구현된 우선순위 큐
        //삽입 offer,add
        //삭제 poll
        //읽기 peek

        /*Stack은 LIFO(Last In, First Out) 작업에 특화.
        Queue는 FIFO(First In, First Out) 작업에 특화.
        단일 스레드 환경에서는 ArrayDeque가 성능 면에서 가장 우수한 대안임.
        */
    }
}
