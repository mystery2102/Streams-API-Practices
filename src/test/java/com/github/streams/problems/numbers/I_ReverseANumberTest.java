package com.github.streams.problems.numbers;

import com.github.streams.problems.numbers.ignore.data.DummyData;
import com.github.streams.solutions.GeneralNumbersProblemSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class I_ReverseANumberTest {

  @Test
  void reverseANumber() {
    final var input = DummyData.fakerNumber();
    var mySolution = GeneralNumbersProblemSolution.reverseANumber(input);

    var yourSolution = IntStream.iterate(input, x -> x > 0, x -> x / 10)
                    .map(x -> x % 10)
                            .reduce(0, (a,b) -> (a * 10) + b);



    Assertions.assertEquals(mySolution, yourSolution);
  }
}
