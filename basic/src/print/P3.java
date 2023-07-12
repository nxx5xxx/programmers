package print;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
//    	���ڿ� str�� ���� n�� �־����ϴ�.
//    	str�� n�� �ݺ��� ���ڿ��� ����� ����ϴ� �ڵ带 �ۼ��� ������.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(str);
        }
        sc.close();
    }
}