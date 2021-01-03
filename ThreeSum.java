import java.util.Arrays;
import java.util.Scanner;
class ThreeSum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // Length of an array

    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Target");
    int n_find = sc.nextInt();

    Arrays.sort(a); // Sort the array if array is not sorted

    for (int i = 0; i < n; i++) {

      int l = i + 1, r = n - 1;

      while (l < r) {
        if (a[i] + a[l] + a[r] == n_find) {
          System.out.println(a[i] + " " + a[l] + " " + a[r]);
          break;
        } // if you want all the triplets write l++;r--; insted of break;
        else if (a[i] + a[l] + a[r] < n_find) l++;
        else r--;
      }
    }

    sc.close();
  }
}
