package com.g_sudarshan;

public class BinarySearch {

  public static void main(String args[]) {
    int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int target = 90;
    int ans = binarySearch(arr, target);
    System.out.println(ans);
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2; // find the middle element
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid; // answer
      }
    }

    return -1;
  }
}
