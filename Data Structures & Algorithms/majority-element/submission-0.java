class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0, element = -1;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > n/2)return nums[i];
        }
        return -1;
    }
}