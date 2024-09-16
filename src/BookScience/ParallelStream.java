package BookScience;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
//                .parallel()
                .reduce(0L, (x,y)->{
                    System.out.println("x= "+x+"; y = "+y+";");
                    return y+=x;
                });
    }

    public static void main(String[] args) {
        ParallelStream pS = new ParallelStream();
        List<Long> list = Collections.singletonList(pS.parallelSum(5));
        System.out.println(list);

    }
}
