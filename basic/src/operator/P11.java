/*

���� ����Ʈ�� ���ڿ��� ��ȯ�ϱ�
���� ����
���ڵ��� ����ִ� �迭 arr�� �־����ϴ�. arr�� ���ҵ��� ������� �̾� ���� ���ڿ��� return �ϴ� solution�Լ��� �ۼ��� �ּ���.

���ѻ���
1 �� arr�� ���� �� 200
arr�� ���Ҵ� ���� ���ĺ� �ҹ��ڷ� �̷���� ���̰� 1�� ���ڿ��Դϴ�.
����� ��
arr	result
["a","b","c"]	"abc"

 */
package operator;

public class P11 {
    public String solution(String[] arr) {
        String answer = "";
        for(int o=0;o<arr.length;o++){
            answer = answer + arr[o];
        }
        return answer;
    }
}