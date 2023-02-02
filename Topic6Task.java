public class Topic6Task {

  public static void main(String[] args) {
    System.out.println(greatestCommonDivisor(10, 5)); // 5
    System.out.println(greatestCommonDivisor(15, 21)); // 3

    System.out.println(smallestCommonMultiple(15, 5)); // 15
    System.out.println(smallestCommonMultiple(1, 10)); // 10
    System.out.println(smallestCommonMultiple(2, 3)); // 6

    System.out.println(greatestCommonDivisor(10, 15, 20, 25)); // 5

    System.out.println(smallestCommonMultiple(10, 15, 20)); // 60

    System.out.println(sumOfFactorialsOfOddNumbers(9)); // 368047
  }

  private static int smallestCommonMultiple(int a, int b) {
    return a * b / greatestCommonDivisor(a, b);
  }

  private static int greatestCommonDivisor(int a, int b) {
    if (b == 0) {
      return a;
    }

    return greatestCommonDivisor(b, a % b);
  }

  private static int greatestCommonDivisor(int a, int b, int c, int d) {
    return greatestCommonDivisor(greatestCommonDivisor(a, b), greatestCommonDivisor(c, d));
  }

  private static int smallestCommonMultiple(int a, int b, int c) {
    return smallestCommonMultiple(smallestCommonMultiple(a, b), c);
  }

  private static int sumOfFactorialsOfOddNumbers(int to) {
    int result = 0;

    for (int i = 1; i <= to; i++) {
      if (i % 2 != 0) {
        result += factorial(i);
      }
    }

    return result;
  }

  private static int factorial(int n) {
    int result = 1;

    while (n > 0) {
      result *= n;
      n--;
    }

    return result;
  }

}