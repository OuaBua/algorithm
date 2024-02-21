package week1;

import java.util.Scanner;

public class _02Average {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nArr = new int[N];

        for(int i = 0; i < nArr.length; i++) {
            nArr[i] = sc.nextInt();
        }

        long sum = 0, max = 0;
        for (int i = 0; i  <nArr.length; i++) {
            if (max < nArr[i]) {
                max = nArr[i];
            }
            sum += nArr[i];
        }

        System.out.println(sum * 100.0 / max / N);
    }
}

