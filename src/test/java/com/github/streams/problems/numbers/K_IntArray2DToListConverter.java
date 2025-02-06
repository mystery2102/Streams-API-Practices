package com.github.streams.problems.numbers;

import com.github.streams.problems.numbers.ignore.data.DummyData;
import com.github.streams.solutions.GeneralNumbersProblemSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class K_IntArray2DToListConverter {
  @Test
  void convertInt2DArrayToList() {
    final int[][] input = DummyData.random2DPrimitiveArray();

    var mySolution = GeneralNumbersProblemSolution.convertInt2DArrayToList(input);
    var yourSolution = Arrays.stream(input)
            .map(arr -> Arrays.stream(arr).boxed().toList())
            .toList();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
