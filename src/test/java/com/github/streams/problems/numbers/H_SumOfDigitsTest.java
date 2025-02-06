package com.github.streams.problems.numbers;

import com.github.streams.problems.numbers.ignore.data.DummyData;
import com.github.streams.solutions.GeneralNumbersProblemSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Tests the sumOfDigits method in the GeneralNumbersProblemSolution class.
 *
 * This test case generates a random integer between 1 and the maximum possible integer value,
 * passes it to the sumOfDigits method, and verifies that the result is correct.
 *
 * Note: This test case is currently disabled and should be updated to reflect the correct expected behavior.
 *
 * @see GeneralNumbersProblemSolution#sumOfDigits(int)
 */
class H_SumOfDigitsTest {

  @Test
  void testSumOfDigits() {
    final var input = DummyData.fakerNumber();
    var mySolution = GeneralNumbersProblemSolution.sumOfDigits(input);
    IntPredicate isDivisibleBy10 = num -> num > 0;
    IntUnaryOperator divide10 = num -> num / 10;
    var yourSolution = IntStream.iterate(input, isDivisibleBy10, divide10).map(x -> x % 10).sum();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
