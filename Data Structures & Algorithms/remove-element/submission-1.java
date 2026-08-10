class Solution {
    public int removeElement(int[] nums, int val) {

        List<Integer> temp = new ArrayList<>();
        for (int num: nums){
            if (num != val){
                temp.add(num);
            }
        }
        
        for (int i = 0; i < temp.size(); i++){
            nums[i] = temp.get(i);
        }

        return temp.size();
        // int count = 0;
        // int n = nums.length, k=0;
        // for(int i=0; i<n; i++){
        //     if(nums[i] != val){
        //         nums[k++] = nums[i];
        //     }
        // }
        // return k;  -- TWO-POINTER - 1
        

        // int n = nums.length, i = 0;
        // while(i < n){
        //     if(nums[i] == val){
        //         nums[i] = nums[--n];
        //     }else{
        //         i++;
        //     }
        // }
        // return n; -- TWO-POINTER - 2

    }
}