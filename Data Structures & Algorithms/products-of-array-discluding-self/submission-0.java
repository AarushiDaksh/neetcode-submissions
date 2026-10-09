class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int leftP=1;
        for(int i=0;i<n;i++){
            ans[i]=leftP;
            leftP=leftP*nums[i];
        }

        int rightP=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightP;
            rightP=rightP*nums[i];
        }

        return ans;

    }
}  
