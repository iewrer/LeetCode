package LinkedListCycle;

import java.awt.List;

public class Solution {
	//�������л�����
    public boolean hasCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
    	//��ͷΪ�գ���Ȼû�л�
    	if (head == null) {
			return false;
		}
    	//��������ָ��
        ListNode i = head;
        ListNode j = head;
        while (true) {
        	//ÿ��i��һ��,j������
			i = i.next;
			j = j.next;
			if (j!=null) {
				j = j.next;
			}
			//��Ϊj�ߵÿ죬�������j�ߵ�ͷ�ˣ���Ȼû�л�
			if (j==null) {
				return false;
			}
			//���i,j�����ˣ���˵���л�
			else if(i==j){
				return true;
			}
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
