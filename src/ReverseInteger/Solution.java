package ReverseInteger;

import javax.management.relation.Relation;
//转换为字符串进行处理
//应该也可以使用求余数的办法来实现
//注意：
//1.正负号处理
//2.以0为结尾的数字颠倒后如何处理
//3.数组下标越界
//4.int溢出
public class Solution {
    public int reverse(int x) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        Integer origin = new Integer(x);
        char[] input = origin.toString().toCharArray();
        //若直接复制input到output貌似会导致两者公用一个数据，一改都改
        char[] output = origin.toString().toCharArray();
        int j = 0;
        int counter = 0;
        //如果有符号，那么转换后的字符串从1开始计数
        if (input[0]=='-') {
			j=1;
		}
        //如果末尾有若干连续0，则记录下连续0的个数
        for (int i = input.length-1; i >=0; i--) {
			if (input[i]=='0'&&(i>=1)&&input[i]==input[i-1]) {
				counter++;
			}
			else {
				break;
			}
		}
        //修正连续0的个数
        if (counter!=0) {
            counter++;
		}
        //类似于将该字符串先入栈再出栈
        //注意由于符号的存在，output从1开始计数时j的值可能超过限制
        for (int i = input.length-1-counter; i>=0&&j<output.length; i--,j++) {
			output[j]=input[i];
		}
        //将字符串转回Int
        String reversed = new String(output);
        reversed = reversed.substring(0,reversed.length()-counter);
        Integer result = Integer.parseInt(reversed);
        //如果溢出，则返回0
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
