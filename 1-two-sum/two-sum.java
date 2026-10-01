class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){//O(N)
            int curr=nums[i];
            int need=target-curr;
            if(mp.containsKey(need)){ //O(1)
                ans[0]=i;
                ans[1]=mp.get(need);
                break;
            }
            mp.put(curr,i);
        }
        return ans;
        
    }
}