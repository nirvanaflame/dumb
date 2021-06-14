package com.sputik.playground.codewars.may;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;

class SumFirstNTest {

  @Test
  void shouldReturnSumOfNth() {
    assertThat(seriesSum(5)).isEqualTo("1.57");
    assertThat(seriesSum(9)).isEqualTo("1.77");
  }

  @Test
  void shouldReturnSumOfNthClever() {
    assertThat(seriesSumClever(5)).isEqualTo("1,57");
    assertThat(seriesSumClever(9)).isEqualTo("1,77");
  }

  private String seriesSum(int n) {
    double sum = 1;
    double inc = 4;

    for (int i = 0; i < n - 1; i++) {
      sum += 1 / inc;
      inc += 3;
    }

    return BigDecimal.valueOf(sum)
        .setScale(2, RoundingMode.HALF_UP)
        .toString();
  }

  public String seriesSumClever(int n) {

    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += 1.0 / (1 + 3 * i);
    }

    return String.format("%.2f", sum);
  }
}
