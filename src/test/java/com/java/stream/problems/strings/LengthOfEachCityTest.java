package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralProblemsSolution;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculate the length of city names that start with 'm' or 'M'.
 *
 * <p>List of Cities:
 *
 * <p>- Mumbai - Munnar - Chennai - Hyderabad
 */
class LengthOfEachCityTest {
  @Test
  @Disabled
  void testCalculateLengthOfEachCityTest() {
    final var cities = List.of("Mumbai", "Munnar", "Chennai", "Hyderabad");
    final var mySolution = GeneralProblemsSolution.findLengthOfEachCityAlongWithSize(cities);

    final Map<String, Integer> yourSolution = new HashMap<>();
    Assertions.assertEquals(yourSolution, mySolution);
  }
}
