class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count=new HashMap<>();
        for(int num:nums){
            
            if(!count.containsKey(num)){
                count.put(num,1);
            }
            else{
                count.put(num,count.get(num)+1);
            }
        }

        List<Integer> numbers=new ArrayList<>(count.keySet());
        numbers.sort((a,b)->
        Integer.compare(count.get(b),count.get(a)));

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=numbers.get(i);
        }
        return ans;

    }
}

