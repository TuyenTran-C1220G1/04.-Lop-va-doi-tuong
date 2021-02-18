package com.company.stopwatch;

public class mainProgramCaculationTime {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int arr[] = {64, 25, 12, 22, 11, 15, 20, 23, 26, 28, 31, 25};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        watch.stop();
    }
}
