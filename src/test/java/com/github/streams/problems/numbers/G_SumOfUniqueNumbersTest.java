package com.github.streams.problems.numbers;

import com.github.streams.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given an array of {5,6,7,8,5,5,8,8,7)
 * Find the sum of the unique elements.
 * The output should be in this case is: 26.
 */
class G_SumOfUniqueNumbersTest {

  @Test
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = GeneralNumbersProblemSolution.sumOfUniqueNumbers(input);
    var yourSolution = input.stream()
                    .distinct()
                            .reduce(0, Integer::sum)
            .intValue();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
