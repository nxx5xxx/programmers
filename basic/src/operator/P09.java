/*
���� ����
���ڿ� my_string, overwrite_string�� ���� s�� �־����ϴ�. ���ڿ� my_string�� �ε��� s���� overwrite_string�� ���̸�ŭ�� ���ڿ� overwrite_string���� �ٲ� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.

���ѻ���
my_string�� overwrite_string�� ���ڿ� ���ĺ����� �̷���� �ֽ��ϴ�.
1 �� overwrite_string�� ���� �� my_string�� ���� �� 1,000
0 �� s �� my_string�� ���� - overwrite_string�� ����
����� ��
my_string	overwrite_string	s	result
"He11oWor1d"	"lloWorl"	2	"HelloWorld"
"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
����� �� ����
����� �� #1

���� 1���� my_string���� �ε��� 2���� overwrite_string�� ���̸�ŭ�� �ش��ϴ� �κ��� "11oWor1"�̰� �̸� "lloWorl"�� �ٲ� "HelloWorld"�� return �մϴ�.
����� �� #2

���� 2���� my_string���� �ε��� 7���� overwrite_string�� ���̸�ŭ�� �ش��ϴ� �κ��� "29b8UYP"�̰� �̸� "merS123"�� �ٲ� "ProgrammerS123"�� return �մϴ�.


 */
package operator;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String x = my_string.substring(0,s);
        String answer = "";
        if(x.length()+overwrite_string.length()!=my_string.length()){
            answer = my_string.substring(0,s)+overwrite_string+(my_string.substring(my_string.length()-(my_string.length()-(x.length()+overwrite_string.length()))));
        }else{
        answer = my_string.substring(0,s)+overwrite_string;
        }
        return answer;
    }
}