package studio.aroundhub.stream.sample.generate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {

    public ArrayStream(){
        String[] array = new String[]{"around", "hub", "studio"};
        Stream<String> stream = Arrays.stream(array);
        Stream<String> partStream = Arrays.stream(array, 1, 3);
    }

}
