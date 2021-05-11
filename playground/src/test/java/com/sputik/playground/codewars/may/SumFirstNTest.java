package com.sputik.playground.codewars.may;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SumFirstNTest {

  @Test
  void shouldReturn() {
    assertThat(seriesSum(5)).isEqualTo(1.57);
  }

  private double seriesSum(int n) {
    return n;
  }
}
