/* COMPLETED
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
*/


public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }
        
        // hashmap contains [1. array components 2. instance of every array component] 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n: nums){
            hm.put(n,hm.getOrDefault(n, 0) + 1); 
        }
        
        // using priority queue, create heap to compare values in hashmap 
        // put least common values first = min heap
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> hm.get(n1) - hm.get(n2));
        
        // iterate through hashmap 
        // add least freq elements into heap
        for(int n: hm.keySet()){
            heap.add(n);
            if (heap.size() > k){
                heap.poll(); 
            }
        }
        // create int array result for return
        int [] result = new int[k];
        // fill results array from back to front, therefore most frequent elements are at beginning of array
        for(int i=result.length-1; i>=0; i--){
            result[i] = heap.poll();
        }
        return result; 
    }
}
