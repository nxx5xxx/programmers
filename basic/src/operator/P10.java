/*
���ڿ� ����
���� ����
���̰� ���� �� ���ڿ� str1�� str2�� �־����ϴ�.

�� ���ڿ��� �� ���ڰ� �տ������� ���� �����ư��鼭 �� ���� �����ϴ� ���ڿ��� ����� return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
1 �� str1�� ���� = str2�� ���� �� 10
str1�� str2�� ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��Դϴ�.
����� ��
str1	str2	result
"aaaaa"	"bbbbb"	"ababababab"


 */
package operator;

public class P10 {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0;i<str1.length();i++){
          answer = answer + str1.substring(i,i+1) + str2.substring(i,i+1);
        }

        return answer;
    }
}