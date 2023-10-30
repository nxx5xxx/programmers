package test;

import java.util.Scanner;

public class SqureTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 가로 크기
        int M = scanner.nextInt(); // 세로 크기

        long[][] DP = new long[N + 1][M + 1];
        DP[0][0] = 1;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if (i >= 1) {
                    DP[i][j] += DP[i - 1][j];
                }
                if (j >= 1) {
                    DP[i][j] += DP[i][j - 1];
                }
            }
        }

        System.out.println(DP[N][M]);
    }
}

