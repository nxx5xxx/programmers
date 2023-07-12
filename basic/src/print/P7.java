/*
���ڿ� str�� �־����ϴ�.
���ڿ��� �ð�������� 90�� ������ �Ʒ� ����� ���� ���� ����ϴ� �ڵ带 �ۼ��� ������.

���ѻ���
1 �� str�� ���� �� 10

����� ��
�Է� #1

abcde
��� #1

a
b
c
d
e


 */
package print;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char alst[] = new char[a.length()];
        for(int i=0;i<a.length();i++){
            alst[i] = a.charAt(i);
        }
        
        for(char data : alst){
            System.out.println(data);
        }
        sc.close();
    }
}