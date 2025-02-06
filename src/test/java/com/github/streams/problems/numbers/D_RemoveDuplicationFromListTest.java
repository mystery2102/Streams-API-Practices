package com.github.streams.problems.numbers;

import com.github.streams.problems.numbers.ignore.data.DummyData;
import com.github.streams.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Remove duplicates from an arrayList.
 * */
class D_RemoveDuplicationFromListTest {

  @Test
  void testRemoveDuplicationFromListTest() {
    final var input = DummyData.fakeListOfLongNumbers();
    var yourSolution = input.stream()
            .distinct()
            .toList();
    var mySolution = GeneralNumbersProblemSolution.getUniqueNumberFromList(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
