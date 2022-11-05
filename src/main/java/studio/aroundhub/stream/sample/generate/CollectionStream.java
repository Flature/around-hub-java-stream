package studio.aroundhub.stream.sample.generate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {

    public CollectionStream() {
        // 아래 List 가 상속받고 있는 Collection 인터페이스를 확인해보세요
        List<String> list = Arrays.asList("around", "hub", "studio");

        Stream<String> stream = list.stream();
        // 병렬처리를 하기 위해서는 아래와 같이 스트림을 생성합니다.
        Stream<String> parallelStream = list.parallelStream();
    }
}
