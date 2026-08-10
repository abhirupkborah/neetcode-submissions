class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]==nums[j])return true;
        //     }
        // }
        // return false; -- APPROACH - 1
    //     int n = nums.length;
    //     Set<Integer> ans = new HashSet<>();

    //    for(int i=0; i<n; i++){
    //     if(ans.contains(nums[i])){
    //         return true;
    //     }
    //     ans.add(nums[i]);
    //    }
    //    return false; -- APPROACH - 2

    Set<Integer> ans = new HashSet<>();
    for(int num: nums){
        if(ans.contains(num)){
            return true;
        }
        ans.add(num);
    }
    return false;
    }
}