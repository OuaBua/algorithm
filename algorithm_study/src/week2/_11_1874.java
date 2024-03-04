package week2;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class _11_1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();

        int num = 1;
        boolean result = true;

        // 4 3 6 8 7 5 2 1
        // 1 2 5 3 4
        for(int i = 0; i < N; i++) {
            int aNum = A[i];
            if(aNum >= num) {
                while (aNum >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
            stack.pop();
            bf.append("-\n");
            }
            else {
                int n = stack.pop();

                if (n > aNum) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }
        }
        if(result)
            System.out.println(bf.toString());


    }
}
