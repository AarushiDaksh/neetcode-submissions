class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        Set<Integer> seen = new HashSet<>();
        for(int i=0;i<n;i++){
            seen.add(nums[i]);
        }
        int longest =0;
    for(int num:seen){
        if(num==Integer.MIN_VALUE || !seen.contains(num-1)){
            int cur=num;
            int l=1;
            while(cur!=Integer.MAX_VALUE
                && seen.contains(cur+1)){
                    cur++;
                    l++;
                }
                longest=Math.max(longest,l);
        }
    }
    return longest;

    }
}
