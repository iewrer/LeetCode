package SingleNumber;

import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class Solution {
	HashMap<Integer, Integer> counter = new HashMap<>();
    public int singleNumber(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
    	for (int i = 0; i < A.length; i++) {
			if (counter.containsKey(A[i])) {
				counter.put(A[i], counter.get(A[i])+1);
			}
			else {
				counter.put(A[i], 1);
			}
		}
    	for (int i = 0; i < A.length; i++) {
			if (counter.get(A[i]).equals(1)) {
		        return A[i];
			}
		}
    	return -1;
    }
}
