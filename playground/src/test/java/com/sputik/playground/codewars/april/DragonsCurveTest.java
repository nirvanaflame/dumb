package com.sputik.playground.codewars.april;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class DragonsCurveTest {

  @Test
  void callZeroTimes() {
    assertThat(createCurve(0)).isEqualTo("F");
  }

  @Test
  void callOneTime() {
    assertThat(createCurve(1)).isEqualTo("FRFR");
  }

  @Test
  void callTwoTimes() {
    assertThat(createCurve(2)).isEqualTo("FRFRRLFLFR");
  }

  @Test
  void callThreeTimes() {
    assertThat(createCurve(3)).isEqualTo("FRFRRLFLFRRLFRFRLLFLFR");
  }

  //Make the function; map the chars to Strings
  //a -> aRbFR, b -> LFaLb, otherwise -> itself
  public IntFunction<String> mapFunction = (it) -> it == 'b' ? "aRbFR" :
      it == 'a' ? "LFaLB" : Character.toString(it);


  /**
   * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
   * Then remove the a and b (createFilter function is useful for that)
   */
  public String createCurve(int n) {
    StringBuilder collect = new StringBuilder("F");

    for (int i = 0; i < n; i++) {
      collect.append("a".chars()
          .peek(System.out::println)
          .mapToObj(mapFunction)
          .peek(System.out::println)
          .collect(Collectors.joining()));
    }

    return collect.toString().replaceAll("(?i)([a,b])", "");
  }


  /**
   * How many of the specified char are in the given curve? Hint: createFilter could be useful for
   * this
   */
  public long howMany(char c, String curve) {
    return curve.chars().filter(createFilter(c, true)).count();
  }

  /**
   * Create a predicate to filter the specified char; keep or remove based on keep variable
   */
  public IntPredicate createFilter(char filterWhat, boolean keep) {
    return value -> keep == (value == filterWhat);
  }

}
