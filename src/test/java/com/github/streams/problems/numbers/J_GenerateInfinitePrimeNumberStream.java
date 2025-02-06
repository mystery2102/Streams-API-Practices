package com.github.streams.problems.numbers;

import com.github.streams.solutions.GeneralNumbersProblemSolution;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J_GenerateInfinitePrimeNumberStream {

  @Test
  void intStreamOfPrimeNumber() {
    final var mySolution = GeneralNumbersProblemSolution.generateIntStreamOfPrimeNumberStream(5);
    final var yourSolution = IntStream.range(0, Integer.MAX_VALUE)
            .filter(num -> {
              if(num <= 1) return false;
              for(int i= num/2; i>=2; i--) {
                if(num % i == 0) return false;
              }
              return true;
            })
            .limit(5)
            .boxed()
            .toList();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
