public class AliquotSum {
  public static void main(String[] args) {
    assert aliquotSum(1) == 0;
    assert aliquotSum(6) == 6;
    assert aliquotSum(15) == 9;
    assert aliquotSum(19) == 1;
  }

  /**
   * Finds the aliquot sum of an integer number
   *
   * @param number a positive integer
   * @return aliquot sum of given {@code number}
   */
  public static int aliquotSum(int number) {
    int sum = 0;
    for (int i = 1, limit = number / 2; i <= limit; ++i) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
