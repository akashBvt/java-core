package org.akash.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ReduceTest {
    @Test
  public  void findSumTest(){
    List<Integer> numbers = Arrays.asList(1,2,3,4);
    assertEquals(new Integer(10), Reduce.findsum(numbers));
  }  
}
