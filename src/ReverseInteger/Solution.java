package ReverseInteger;

import javax.management.relation.Relation;
//ת��Ϊ�ַ������д���
//Ӧ��Ҳ����ʹ���������İ취��ʵ��
//ע�⣺
//1.�����Ŵ���
//2.��0Ϊ��β�����ֵߵ�����δ���
//3.�����±�Խ��
//4.int���
public class Solution {
    public int reverse(int x) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        Integer origin = new Integer(x);
        char[] input = origin.toString().toCharArray();
        //��ֱ�Ӹ���input��outputò�ƻᵼ�����߹���һ�����ݣ�һ�Ķ���
        char[] output = origin.toString().toCharArray();
        int j = 0;
        int counter = 0;
        //����з��ţ���ôת������ַ�����1��ʼ����
        if (input[0]=='-') {
			j=1;
		}
        //���ĩβ����������0�����¼������0�ĸ���
        for (int i = input.length-1; i >=0; i--) {
			if (input[i]=='0'&&(i>=1)&&input[i]==input[i-1]) {
				counter++;
			}
			else {
				break;
			}
		}
        //��������0�ĸ���
        if (counter!=0) {
            counter++;
		}
        //�����ڽ����ַ�������ջ�ٳ�ջ
        //ע�����ڷ��ŵĴ��ڣ�output��1��ʼ����ʱj��ֵ���ܳ�������
        for (int i = input.length-1-counter; i>=0&&j<output.length; i--,j++) {
			output[j]=input[i];
		}
        //���ַ���ת��Int
        String reversed = new String(output);
        reversed = reversed.substring(0,reversed.length()-counter);
        Integer result = Integer.parseInt(reversed);
        //���������򷵻�0
        if(result>Integer.MAX_VALUE){
        	return 0;
        }
        return Integer.parseInt(reversed);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution mySolution = new Solution();
		System.out.println(mySolution.reverse(50078));
	}
}
