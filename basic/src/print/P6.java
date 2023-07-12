/*
�� ���� ���ڿ� str1, str2�� �������� ���еǾ� �Է����� �־����ϴ�.
����� ���� ���� str1�� str2�� �̾ ����ϴ� �ڵ带 �ۼ��� ������.

���ѻ���
1 �� str1, str2�� ���� �� 10
����� ��
�Է� #1

apple pen
��� #1

applepen
�Է� #2

Hello World!
��� #2

HelloWorld!


 */
package print;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a+b;
        System.out.println(ab);
        sc.close();
    }
}