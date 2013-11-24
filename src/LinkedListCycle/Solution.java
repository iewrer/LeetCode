package LinkedListCycle;

import java.awt.List;

public class Solution {
	//单链表有环问题
    public boolean hasCycle(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
    	//若头为空，显然没有环
    	if (head == null) {
			return false;
		}
    	//设置两个指针
        ListNode i = head;
        ListNode j = head;
        while (true) {
        	//每次i走一步,j走两步
			i = i.next;
			j = j.next;
			if (j!=null) {
				j = j.next;
			}
			//因为j走得快，所以如果j走到头了，显然没有环
			if (j==null) {
				return false;
			}
			//如果i,j相遇了，则说明有环
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
