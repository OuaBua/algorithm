package week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _13_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> nQ = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            nQ.add(i);
        }
        while(nQ.size()>1) {
            nQ.poll();
            nQ.add(nQ.poll());
        }
        System.out.println(nQ.poll());
    }
}
