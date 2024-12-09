package org.akash.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static Map<Character,Long> charFrequency(String s){
       return s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(e->e,Collectors.counting()));
    }
}
