package com.mycompany.app;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

  private static final int size = 20000;
  private static final SecureRandom random = new SecureRandom();
  private static final Map<Integer, String> map = new HashMap<>(size);

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    for (int j = 0; j < size; j++) {
      map.put(j, new BigInteger(130, random).toString(32) + Foo.s);
    }
    long heapSize = Runtime.getRuntime().totalMemory();
    System.out.println(String.format(">>> heap size: %s mb", heapSize * 1.0 / 1024 / 1024));

    assertTrue(true);
  }
}
