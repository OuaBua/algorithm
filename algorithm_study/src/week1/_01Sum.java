package week1;

import java.util.Scanner;

public class _01Sum {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String nString = scanner.next();
        char[] cArr = nString.toCharArray();
        int sum = 0;

        for(int i = 0;i < cArr.length;i++ ) {
          sum += cArr[i] - '0';
        }
        System.out.println(sum);
    }
}
