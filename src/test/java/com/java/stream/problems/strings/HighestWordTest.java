package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class HighestWordTest {
  @Test
  @Disabled()
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String mySolution = GeneralProblemsSolution.findLargestWordInTheString(input);

    String yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
