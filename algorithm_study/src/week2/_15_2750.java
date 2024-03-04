package week2;

import java.util.Scanner;

public class _15_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for(int i = 0 ; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            int wait = 0;
            for(int j = 0; j < n-1; j++){

                if(nArr[j] > nArr[j+1]) {
                    wait = nArr[j];
                    nArr[j] = nArr[j+1];
                    nArr[j+1] = wait;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(nArr[i]);
        }
    }
}
