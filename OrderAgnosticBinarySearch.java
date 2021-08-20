package com.g_sudarshan;

public class OrderAgnosticBinarySearch {

  public static void main(String[] args) {
    int[] arr = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
    int target = 100;
    int ans = orderAgnosticBinarySearch(arr, target);
    System.out.println(ans);
  }

  static int orderAgnosticBinarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // find wheather array is sorted in ascending or descending order
    boolean isAsc;
    if (arr[start] < arr[end]) {
      isAsc = true;
    } else {
      isAsc = false;
    }

    while (start <= end) {
      int mid = start + (end - start) / 2; // find the middle element
      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return -1;
  }
}
