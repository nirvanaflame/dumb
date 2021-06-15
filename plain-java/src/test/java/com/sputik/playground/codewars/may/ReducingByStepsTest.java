package com.sputik.playground.codewars.may;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.IntUnaryOperator;
import org.junit.jupiter.api.Disabled;
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

  static long[] reduceArray(IntUnaryOperator f, long[] arr, long init) {
    return null;
  }

  @Test
  @Disabled
  void shouldReturn() {
    long[] a = new long[]{18, 69, -90, -78, 65, 40};

    assertThat(reduceArray(null, a, a[0]))
        .isEqualTo(new long[]{18, 18, -90, -90, -90, -90});
  }
}
