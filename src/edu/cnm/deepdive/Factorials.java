package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   * @param n the {@code long} value for which the factorial function is to be computed.
   * @return n!
   * @throws IllegalArgumentException when {@code n < 0}.
   */
  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    BigInteger result = BigInteger.ONE;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n > 0) {
      result = BigInteger.valueOf(n).multiply(computeRecursive(n - 1));
    }
    return result;
  }

  public static BigInteger computeIterative(int n) {
    BigInteger result = BigInteger.ONE;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }

}
