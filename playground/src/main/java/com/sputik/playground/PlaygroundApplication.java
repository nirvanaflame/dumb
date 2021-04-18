package com.sputik.playground;

import com.sputik.playground.dao.Person;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class PlaygroundApplication {

  public static void main(String[] args) {
    float i = goLoop(366) - 100;
    float a = goRecursion(366, 100) - 100;

    assert i == a;

    Person p = Person.builder().id("1").firstName("Name").build();
    passByValue(p);
    System.out.println(p);
  }

  private static void passByValue(Person p) {
    p.setFirstName("myname");
  }

  public static float goRecursion(int base, float profit) {
    profit += profit / 100;
    if (base == 1) {
      return profit;
    }
    return goRecursion(base - 1, profit);
  }

  public static float goLoop(float n) {
    float result = 100;
    for (int i = 1; i <= n; i++) {
      result = result + result / 100;
    }

    return result;
  }
}
