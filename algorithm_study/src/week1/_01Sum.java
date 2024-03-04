package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _01Sum {
    public static void main(String[] arg) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//
//        String nString = scanner.next();
//        char[] cArr = nString.toCharArray();
//        int sum = 0;
//
//        for(int i = 0;i < cArr.length;i++ ) {
//          sum += cArr[i] - '0';
//        }
//        System.out.println(sum);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int sum = 0;

        char[] cArr = bf.readLine().toCharArray();

        for(int i = 0; i < cArr.length; i++) {
            sum += cArr[i] - 48;
        }

        System.out.println(sum);
    }
}
