package booungyiTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Stream_apiEx {
    public static void main(String[] args) {
        //todo stream api사용법
        List<String> list = Arrays.asList("apple,banana", "cherry");
        //Todo filter : 조건에 맞는 데이터만 필터링
        List<String> filteredList = list.stream()
                .filter(s -> s.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(filteredList);
        //Todo  map = 데이터 변환
        List<Integer> lengths = list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths);

        //TOdo sorted : 정렬
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

        //Todo forEach :각 요소를 출력
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12);
        numbers.stream().forEach(System.out::println);


        //Todo collect : 결과를 컬렉션으로 변환
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(doubled);
    }

    /*Strema api  주요 메서드
    * filter(Predicate)
    * 조건에 맞는 요소만 포함.
    * 예: .filter(n -> n>10)
    *
    * map(Function)
    * 요소를 반환
    * 예: .map(String::length)
    *
    * distinct()
    * 중복제거
    *
    * sorted()
    * 정렬(기본 또는 사용자 정의).
    *
    * limit(n) / skip(N)
    * 스트림의 요소를 제한하거나 건너뜀.
    *
    * forEach(consumer)
    * 각요소에 대해 작업 수행
    *
    *  collect(Collector)
    * 결과를 컬렉션이나 문자열 등으로 변환.
    *  예: . collect(Collectors.toList())
    *
    * reduce(BinaryOperator)
    *스트림의 값을 누적 계산.
    * 에:. . reduce(0, Integer::sum)
    *
    * count()
    * 요소 개수를 반환.
    *

    * */
}




