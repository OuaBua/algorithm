package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _07_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);;

        int count = 0;
        int startIndex = 0;
        int endIndex = A.length-1;

        while(startIndex < endIndex) {
            if(A[startIndex] + A[endIndex] < M) {
                startIndex++;
            } else if(A[startIndex] + A[endIndex] > M) {
                endIndex--;
            } else {
                count++;
                startIndex++;
                endIndex--;
            }
        }

        System.out.println(count);



//        int sum = 0;
//
//        for (int i = 0; i < N; i++) {
//            sum = A[startIndex] + A[endIndex];
//            if (sum == M) {
//                count++;
//                startIndex++;
//            } else if (sum < M) {
//                startIndex++;
//            } else {
//                endIndex--;
//            }
//        }


    }
}
