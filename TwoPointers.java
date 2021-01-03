import java.util.Arrays;
class TwoPointers {

  public static void main(String[] args) {
    int[] arr = {10, 20, 35, 50, 75, 80};
    int key = 70;
    assert isPairedSum(arr, key); /* 20 + 60 == 70 */

    arr = new int[] {1, 2, 3, 4, 5, 6, 7};
    key = 13;
    assert isPairedSum(arr, key); /* 6 + 7 == 13 */

    key = 14;
    assert !isPairedSum(arr, key);
  }
  private static boolean isPairedSum(int[] arr, int key) {
    Arrays.sort(arr);
    int i = 0; /* index of first element */
    int j = arr.length - 1; /* index of last element */

    while (i < j) {
      if (arr[i] + arr[j] == key) {
        return true;
      } else if (arr[i] + arr[j] < key) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }
}
