/*
���� ����
�ڿ��� n�� �Է����� �־����� �� ���� n�� ¦���̸� "n is even"��, Ȧ���̸� "n is odd"�� ����ϴ� �ڵ带 �ۼ��� ������.

���ѻ���
1 �� n �� 1,000
����� ��
�Է� #1

100
��� #1

100 is even
�Է� #2

1
��� #2

1 is odd


 */
package print;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
        sc.close();
    }
}