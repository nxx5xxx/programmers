package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
		long beforeTime = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] str_arr = input.split(" ");
        int[] arr = new int[3];
        for (int i = 0; i < str_arr.length; i++) arr[i] = Integer.parseInt(str_arr[i]);
        int n = arr[0], m = arr[1], k = arr[2];

        HashSet<String> n_set = new HashSet<>();
        HashSet<String> m_set = new HashSet<>();

        int[] sequence = new int[k];
        generateSequences(0, n, m, k, sequence, n_set, m_set);

        System.out.println(n_set.size() + m_set.size());
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long diffTime = afterTime - beforeTime; // 두 개의 실행 시간
        System.out.println("실행 시간(ms): " + diffTime); // 세컨드(초 단위 변환)
    }

    static void generateSequences(int round, int n, int m, int k, int[] sequence, HashSet<String> n_set, HashSet<String> m_set) {
        if (round == k) {
            int n_score = n;
            int m_score = m;
            StringBuilder n_sequence = new StringBuilder();
            StringBuilder m_sequence = new StringBuilder();

            for (int i = 0; i < k; i++) {
                n_score += sequence[i];
                m_score -= sequence[i];
                n_sequence.append(sequence[i]);
                m_sequence.append(-sequence[i]);

                if (n_score <= 0) {
                    n_set.add(n_sequence.toString());
                    break;
                }

                if (m_score <= 0) {
                    m_set.add(m_sequence.toString());
                    break;
                }
            }
        } else {
            for (int i = -1; i <= 1; i++) {
                sequence[round] = i;
                generateSequences(round + 1, n, m, k, sequence, n_set, m_set);
            }
        }
    }
}
