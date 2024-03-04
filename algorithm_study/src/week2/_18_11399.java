package week2;

import java.util.Scanner;

public class _18_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] s = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++){
            int target = i;
            int target_value = a[i];
            for(int j = i -1; j >= 0; j--) {
                if(a[j] < a[i]) {
                    target = j + 1;
                    break;
                }
                if(j == 0){
                    target = 0;
                }
            }

            for(int j = i; j > target; j--) {
                a[j] = a[j-1];
            }
            a[target] = target_value;
        }
        s[0] = a[0];
        int sum = 0;
        for (int i = 1; i < n; i++){
            s[i] = s[i-1] + a[i];
        }

        for(int i = 0 ; i< n; i++) {
            sum = sum + s[i];
        }
        System.out.println(sum);



    }

}
