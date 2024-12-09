package org.akash.streams;

import java.util.List;

public class Reduce {
    public static Integer findsum(List<Integer> numbers){
        return numbers.stream().reduce(0,Integer::sum);
    }
}
