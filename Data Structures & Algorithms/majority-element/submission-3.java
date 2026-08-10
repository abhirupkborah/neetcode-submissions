
class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // int count = 0, element = -1;
        // for (int i = 0; i < n; i++){
        //     for (int j = i; j < n; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if (count > n/2)return nums[i];
        // }
        // return -1; //BRUTE FORCE
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1);
        //     }else{
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        //     if(map.get(nums[i]) > n/2)return  nums[i];
        // }
        // return -1; MAP -1
        map.put(num, map.getOrDefault(num,0)+1);
        if(map.get(num) > n/2){
            return num;
        }
    }
    return -1;
}
}