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

        // int n= nums.length;
        // int[] ans= new int[2];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             return ans;
        //         }
        //     }
        // }
        // return new int[0];

    }
}
