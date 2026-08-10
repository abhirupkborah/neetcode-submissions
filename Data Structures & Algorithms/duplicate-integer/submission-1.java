class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]==nums[j])return true;
        //     }
        // }
        // return false;
        int n = nums.length;
        Set<Integer> ans = new HashSet<>();

       for(int i=0; i<n; i++){
        if(ans.contains(nums[i])){
            return true;
        }
        ans.add(nums[i]);
       }
       return false;
    }
}