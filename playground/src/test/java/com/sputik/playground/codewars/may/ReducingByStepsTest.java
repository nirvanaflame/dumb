package com.sputik.playground.codewars.may;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class ReducingByStepsTest {


  static long gcdi(long a, long b) {
    return Math.abs(a) + Math.abs(b);
  }

  static long lcmu(long a, long b) {
    return Math.abs(a) + Math.abs(b);
  }

  static long som(long a, long b) {
    return a + b;
  }

  static long maxi(long a, long b) {
    return Math.max(a, b);
  }

  static long mini(long a, long b) {
    return Math.min(a, b);
  }

  static long[] operArray(Function f, long[] arr, long init) {
    return null;
  }

  @Test
  void shouldReturn() {
    long[] a = new long[]{18, 69, -90, -78, 65, 40};

    long[] r = new long[]{18, 3, 3, 3, 1, 1};

    r = new long[]{18, 18, -90, -90, -90, -90};
    assertThat(ReducingByStepsTest.operArray(null, a, a[0])).isEqualTo(r);
  }
}
