class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>seen = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ans= target- nums[i];
            if(seen.containsKey(ans)){
                return new int[] {seen.get(ans),i};
            }
            seen.put(nums[i],i);
        }
        return new int[] {};
    }
}
