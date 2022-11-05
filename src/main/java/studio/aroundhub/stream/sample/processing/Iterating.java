package studio.aroundhub.stream.sample.processing;

import java.util.stream.IntStream;

public class Iterating {

    public Iterating(){
        // peek 메소드는 스트림 요소들을 대상으로 특정 연산을 수행할 수 있습니다.
        // peek 메소드는 Consumer 를 인자로 받습니다.
        int sum = IntStream.of(1,2,3,4,5)
                .peek(System.out::println) // 특정 작업을 수행할 뿐 결과에 영향을 주지 않습니다.
                .sum();

        System.out.println(sum);
    }

}
