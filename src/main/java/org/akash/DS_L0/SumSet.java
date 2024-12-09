package org.akash.DS_L0;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SumSet {
    public static  Map<Integer,List<Integer>> consecutiveSumSet(List<Integer> numbers){
       int index=0;
       int mapIndex =1 ;
        Map<Integer,List<Integer>> sumSet= new LinkedHashMap<>();
            for (int i = index; i < numbers.size(); i++) {
                if (i + 2 < numbers.size()-1) {
                    // Check consecutive triplets
                    if (numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2) == 6) {
                        sumSet.put(mapIndex++, Arrays.asList(numbers.get(i), numbers.get(i + 1), numbers.get(i + 2)));
                    } 
                    // Check first, second last, and last numbers
                    
                }else if (numbers.get(i) + numbers.get(numbers.size() - 2) + numbers.get(numbers.size() - 1) == 6) {
                    sumSet.put(mapIndex++, Arrays.asList(numbers.get(i), numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1)));
                }
            }
        return sumSet;
    }
}
