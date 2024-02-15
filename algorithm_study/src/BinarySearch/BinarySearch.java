package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;


// 백준 1920. 수찾기

public class BinarySearch {
    public static void  main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num ; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        int num2 = scanner.nextInt();
        for(int i = 0; i < num2; i++) {
            int target = scanner.nextInt();

            boolean result = binarySearch(array, target);

            System.out.println(result ? 1 : 0);


        }

    }

    // 이진탐색 함수

    private static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

}
