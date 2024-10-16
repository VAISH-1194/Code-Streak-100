Question

https://leetcode.com/problems/last-stone-weight/description/

Answer

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int stone : stones)
            maxHeap.offer(stone);
        while(maxHeap.size() > 1)
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        return maxHeap.poll();
    }
}