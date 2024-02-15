import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
    	int res =0;
    	int majority = 0;
    	// initializes hashmap called m
    	HashMap<Integer, Integer> m = new HashMap<>(); 
    	for(int i : nums) {
    		// iterating through the nums array and adding them into hashmap m
    		m.put(i, 1 + m.getOrDefault(i,0));
    		// Using getOrDefault() to get the current count or 0 if the key is not present
    		if(m.get(i) > majority) {
    			res = i;
    			majority = m.get(i);
    		}
    	}
    	return res;
    }
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	int[] arr1 = {3,2,3};
    	int[] arr2 = {2,2,1,1,1,2,2};
    	int[] arr3= {6,5,5};
    	System.out.println(sol.majorityElement(arr1));
    	System.out.println(sol.majorityElement(arr2));
    	System.out.println(sol.majorityElement(arr3));
    }
}