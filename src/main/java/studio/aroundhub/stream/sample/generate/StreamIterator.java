package studio.aroundhub.stream.sample.generate;

import java.util.stream.Stream;

public class StreamIterator {

    public StreamIterator() {
        // iterate 메소드를 사용하여 주입할 값을 만들 수 있습니다.
        Stream<String> iteratedStream = Stream.iterate("around hub", n -> n + " studio").limit(3);

        iteratedStream.forEach(System.out::println);
    }
}
