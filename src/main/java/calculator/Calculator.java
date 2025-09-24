package calculator;

public class Calculator {
  public static double add(double x, double y) {
    return x + y;
  }

  public static double subtract(double x, double y) {
    return x - y;
  }

  public static double multiply(double x, double y) {
    return x * y;
  }

  public static double divide(double x, double y) {
    if (x == 1.0) {
      return 1.0 / y;
    }
    if (y == 1) {
      return x;
    }
    return x / y;
  }
}
