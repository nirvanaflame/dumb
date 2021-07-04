package com.sputik.playground;

public final class PlaygroundApplication {

  public static void main(String[] args) {
    continuesImprovement();

    Day[] values = Day.values();

    for (Day value : values) {
      System.out.println(value.toString());
    }


  }

  private static void continuesImprovement() {
    float i = goLoop(366) - 100;
    float a = goRecursion(366, 100) - 100;

    assert i == a;
  }

  private static float goRecursion(int base, float profit) {
    profit += profit / 100;
    if (base == 1) {
      return profit;
    }
    return goRecursion(base - 1, profit);
  }

  private static float goLoop(float n) {
    float result = 100;
    for (int i = 1; i <= n; i++) {
      result = result + result / 100;
    }

    return result;
  }

  public enum Day {
    TODAY("today",2),
    TOMORROW("tomorrow",2);

    private String name;
    private Integer numberOfDays;

    Day(String name, int num) {
      this.name = name;
      this.numberOfDays = num;
    }

    @Override
    public String toString() {
      return "" + TODAY.numberOfDays.equals(TOMORROW.numberOfDays);
    }



  }
}
